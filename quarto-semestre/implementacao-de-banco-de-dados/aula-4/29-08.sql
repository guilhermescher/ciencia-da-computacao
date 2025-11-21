USE EMPRESA;

SELECT *
FROM DEPARTAMENTO AS D
WHERE EXISTS (SELECT 1
              FROM PROJETO AS P
              WHERE P.Dnum = D.Dnumero);

SELECT * 
FROM FUNCIONARIO AS F
WHERE F.Salario > ALL (SELECT F.Salario FROM FUNCIONARIO AS F JOIN DEPARTAMENTO AS D ON F.Dnr = D.Dnumero WHERE D.Dnome = 'Administração');

SELECT P.Projnome, SUM(T.Horas)
FROM PROJETO AS P
JOIN TRABALHA_EM AS T
ON T.Pnr = P.Projnumero
GROUP BY P.Projnome
HAVING SUM(T.Horas) > ALL (SELECT sum(T.Horas) FROM TRABALHA_EM AS T INNER JOIN PROJETO AS P ON P.Projnumero = T.Pnr WHERE P.Projlocal = 'Santo André' OR P.Projlocal = 'Santo André')

DECLARE @idade INT,
        @nome VARCHAR(50),
        @data DATE,
        @grana MONEY;

SET @nome = 'Guilherme da Silva Scher'
SET @data = '2005-12-29' -- AAAA-MM-DD
SET @idade = YEAR(GETDATE()) - YEAR(@data)
SET @grana = 1

PRINT 'MEU NOME É: ' + @nome + ', NASCI EM: ' + CAST(@data AS VARCHAR(11)) + ', MINHA IDADE É: ' + CAST(@idade AS VARCHAR(2)) + ' E MINHA GRANA É: ' + CAST(@grana AS VARCHAR(5))
SELECT @nome AS 'NOME', @data AS 'DATA_NASCIMENTO', @idade AS 'IDADE', @grana AS 'GRANA'

DECLARE @nomedepartamento VARCHAR(50)
--SET @nomedepartamento = (select d.Dnome from DEPARTAMENTO as d where d.Dnumero = 4)
select @nomedepartamento = d.Dnome from DEPARTAMENTO as d where d.Dnumero = 4
PRINT @nomedepartamento

/*DECLARE @salariojennifer FLOAT
select @salariojennifer = f.Salario from FUNCIONARIO as f where f.Pnome = 'Jennifer'
PRINT CAST(@salariojennifer AS VARCHAR(50))
SET @salariojennifer += (@salariojennifer * 0.1)
PRINT CAST(@salariojennifer AS VARCHAR(50))
DECLARE @idadejennifer INT
DECLARE @datanascjennifer DATE
select @datanascjennifer = f.Datanasc from funcionario as f where f.Pnome = 'Jennifer'
SET @idadejennifer = YEAR(GETDATE()) - YEAR(@datanascjennifer)
PRINT CAST(@idadejennifer AS VARCHAR(3))
PRINT CONVERT(VARCHAR(10), @datanascjennifer, 103)*/

DECLARE @salariojennifer FLOAT
select @salariojennifer = f.Salario from FUNCIONARIO as f where f.Pnome = 'Jennifer'
declare @media float
select @media = avg(f.Salario) from FUNCIONARIO as f

if(@salariojennifer < @media)
    print 'menor'
else
    print 'maior'

print cast(@media as varchar(50))
print cast(@salariojennifer as varchar(50))

DECLARE @idadejennifer INT
DECLARE @datanascjennifer DATE
select @datanascjennifer = f.Datanasc from funcionario as f where f.Pnome = 'Jennifer'
SET @idadejennifer = YEAR(GETDATE()) - YEAR(@datanascjennifer)

if @idadejennifer >= 80
    PRINT 'veia pra caraio'
else if @idadejennifer >= 60
    print 'veia'
else
    print 'nova'

declare @bonusjennifer float
select @bonusjennifer = f.Bonus from FUNCIONARIO as f where f.Pnome = 'Jennifer'
if(@bonusjennifer > 0)
    print 'tem bonus'
else
    print 'nao tem bonus'