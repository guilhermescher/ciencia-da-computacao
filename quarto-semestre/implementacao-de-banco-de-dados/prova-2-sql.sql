-- gui scher
USE PapelariaDB;

-- 1
/*
Transações são blocos de código que podem ser rodados para evitarem erros, os quais podem ser commitados para que as mudanças sejam aplicadas no banco ou pode ser feito o rollback para cancelar tudo que foi feito dentro da transação.
A - atomicidade - Ou realiza todo o bloco ou não realiza nada
C - consistencia - O banco fica em estado válido antes e depois
I - isolamento - Uma transação não interfere em outra
D - durabilidade - Após o commit, os dados permanecem mesmo caso haja uma falha
*/

-- 2
GO;
BEGIN TRAN
UPDATE Produtos SET PrecoVenda = 5 WHERE Descricao = 'Caneta BIC cristal';
IF @@ROWCOUNT != 1
	ROLLBACK TRAN;
ELSE
	COMMIT TRAN;
SELECT * FROM Produtos
GO;

-- 3
/*
Triggers são gatilhos que são disparados caso haja uma ação na tabela em que ele foi vinculado.
Ele pode ser disparado após a inserção, atualização ou deleção de um dado na tabela em que ele foi vinculado.
Após ele ser disparado, o trigger pode tanto rodar um bloco de código após a modificação na tabela vinculada, quanto substituir a modificação, rodando ao invés o bloco de código do trigger.
*/

-- 4
GO;
CREATE OR ALTER TRIGGER ex4
ON ItensVenda
AFTER INSERT
AS
BEGIN
	DECLARE @qtdItens int
	SELECT @qtdItens = Quantidade from inserted
	DECLARE @idItemVenda VARCHAR(50)
	SELECT @idItemVenda = CodigoBarras from inserted
	DECLARE @idVenda int
	SELECT @idVenda = VendaID from inserted
	DECLARE @qtdEstoque int
	SELECT @qtdEstoque = QuantidadeEstoque from Produtos where CodigoBarras = @idItemVenda
	IF @qtdEstoque < @qtdItens
	BEGIN
		ROLLBACK TRAN;
		PRINT 'Erro: Estoque insuficiente para um ou mais produtos';
	END
	ELSE
	BEGIN
	UPDATE Produtos SET QuantidadeEstoque = QuantidadeEstoque - @qtdItens WHERE CodigoBarras = @idItemVenda
	DECLARE @valortotal float
	SELECT @valortotal = PrecoVenda FROM Produtos WHERE CodigoBarras = @idItemVenda
	SET @valortotal = @valortotal * @qtdItens
	UPDATE Vendas SET ValorTotal = @valortotal WHERE VendaID = @idVenda
GO;

-- 5
GO;
CREATE TABLE LogProdutos (
	LogID INT PRIMARY KEY IDENTITY(1,1),
	ProdutoID INT,
	TipoOperacao VARCHAR(1),
	DataOperacao DATETIME DEFAULT GETDATE()
	FOREIGN KEY ProdutoID REFERENCES Produtos(CodigoBarras)
	);

CREATE TRIGGER trigLog
ON Produtos
AFTER UPDATE, DELETE
AS
BEGIN
	IF UPDATE(Nome)
	BEGIN
		DECLARE @ProdId VARCHAR(50)
		SELECT @ProdId = CodigoBarras from inserted
		INSERT INTO LogProdutos (ProdutoID, TipoOperacao) VALUES (@ProdId, 'U');
	END
	ELSE
	BEGIN
		DECLARE @ProId VARCHAR(50)
		SELECT @ProId = CodigoBarras from deleted
		INSERT INTO LogProdutos (ProdutoID, TipoOperacao) VALUES (@ProId, 'D')
	END
END
GO;

-- 6
GO;
CREATE TRIGGER trg_InativarCliente
ON Cliente
INSTEAD OF DELETE
AS
BEGIN
	DECLARE @ID INT;
	SELECT @ID = ClienteID from deleted
	UPDATE Cliente SET Status = 'I' WHERE ClienteID = @ID
END
GO;

-- 7
/*
Restrições de integridade garantem que os dados do banco permaneçam corretos e coerentes
Declarativa - DDL, primarys keys e not null
Procedural - Triggers e stored procedures
Integridade de domínio - se é do domínio numérico, não se pode inserir letras
Integridade referencial - se há um item em uma tabela que referencia outra, o item também deve existir na tabela referenciada.
Integridade de vazio - informa se a coluna é obrigatória ou opcional
Integridade de chave - valores primary key devem ser únicos
Integridade definida pelo usuário - outras regras comerciais definidas pelo usuário, mas que as outras também podem ajudar
*/

-- 8
/*
Não sei :(
*/

-- 9
/*
Views são pesquisas que você pode recorrer armazenando-a em uma view, ao invés de ter que escrever todo o código da pesquisa e rodar ela toda vez que quiser realizá-la, você pode simplesmente armazenar em uma view e rodar ela.
Elas são muito úteis para armazenar pesquisas extensas em que você tem que executar com certa frequência.
*/

-- 10
GO;
CREATE VIEW vw_RelatorioDetalhadoVendas AS
SELECT V.VendaID, V.DataVenda, C.Nome, P.Nome, CA.Nome, IV.Quantidade, IV.PrecoUnitario, (IV.Quantidade * IV.PrecoUnitario) as 'SubtotalItem'
FROM Vendas AS V
JOIN Clientes AS C ON C.ClienteID = V.ClienteID
JOIN ItensVenda AS IV ON IV.VendaID = V.VendaID
JOIN Produtos AS P ON P.CodigoBarras = IV.CodigoBarras
JOIN Categorias AS CA ON CA.CategoriaID = P.CategoriaID
GO;

-- 11
GO;
USE [master]
GO
CREATE LOGIN [estagiario] WITH PASSWORD=N'123', DEFAULT_DATABASE=[PapelariaDB], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
USE [PapelariaDB]
GO
CREATE USER [estagiario] FOR LOGIN [estagiario]
GO
USE [PapelariaDB]
GO
ALTER ROLE [db_datareader] ADD MEMBER [estagiario]
GO

GRANT INSERT ON Produtos TO estagiario;
GO;

-- 13
GO;
CREATE VIEW vw_ProductCatalog AS
SELECT P.Nome AS 'NomeProduto', C.Nome AS 'NomeCategoria', P.PrecoVenda
FROM Produtos AS P
JOIN Categorias AS C ON C.CategoriaID = P.CategoriaID;
GO;