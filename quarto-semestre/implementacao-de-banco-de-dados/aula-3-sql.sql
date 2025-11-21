use microsoft;

/*Criar um relatório que mostre os detalhes principais dos produtos, combinando
informações de produtos, categorias e fornecedores. Listar o nome do produto, o
nome da empresa fornecedora, o nome da categoria, o preço unitário do produto e a
quantidade em estoque.*/SELECT ProductName, CompanyName, CategoryName, UnitPrice, UnitsInStock
FROM Products
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
JOIN Categories ON Products.CategoryID = Categories.CategoryID;
/*Filtrar a lista de produtos, mostrando apenas aqueles que estão disponíveis para
venda imediata. A partir da consulta anterior, ocultar os produtos que possuem
estoque zerado ou que foram descontinuados.*/SELECT ProductName, CompanyName, CategoryName, UnitPrice, UnitsInStock
FROM Products
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE UnitsInStock > 0 AND Discontinued = 0;
/* Analisar a produtividade da equipe de vendas, contando o número total de pedidos
(vendas) por vendedor. Mostrar o nome completo de cada vendedor (funcionário) e a
quantidade total de vendas que ele realizou.*/
SELECT FirstName, LastName, COUNT(OrderID) AS TotalVendas
FROM Employees
JOIN Orders ON Employees.EmployeeID = Orders.EmployeeID
GROUP BY FirstName, LastName;

/*Identificar os vendedores com o maior volume de transações. Utilizando a mesma
lógica da consulta anterior, exibir apenas os vendedores que realizaram uma
quantidade de vendas maior ou igual a 100.*/
SELECT FirstName, LastName, COUNT(OrderID) AS TotalVendas
FROM Employees
JOIN Orders ON Employees.EmployeeID = Orders.EmployeeID
GROUP BY FirstName, LastName
HAVING COUNT(OrderID) >= 100;

/*Entender a distribuição de trabalho dos vendedores por áreas geográficas. Mostrar o
nome completo do vendedor e a quantidade de territórios aos quais ele está
vinculado.*/
SELECT FirstName, LastName, COUNT(TerritoryID) AS QtdeTerritorios
FROM Employees
JOIN EmployeeTerritories ON Employees.EmployeeID = EmployeeTerritories.EmployeeID
GROUP BY FirstName, LastName;

/*Classificar os pedidos pelo seu valor monetário total, permitindo identificar as vendas
mais valiosas. Listar todos os pedidos, calculando o valor total de cada um
(considerando preço, quantidade e desconto) e ordená-los do maior para o menor
valor.*/
SELECT Orders.OrderID, SUM(UnitPrice * Quantity * (1 - Discount)) AS ValorTotal
FROM Orders
JOIN [Order Details] ON Orders.OrderID = [Order Details].OrderID --tava dando errado pq eu tava usando sem colchetes e tinha espaço pelo q eu entendi
GROUP BY Orders.OrderID
ORDER BY ValorTotal DESC;

/*Crie uma consulta que identifique todos os itens de pedidos que foram vendidos por
um preço unitário inferior ao padrão cadastrado na tabela de produtos. Exiba o ID do
Pedido, o nome do produto, o preço de lista e o preço que foi efetivamente*/
SELECT OrderID, ProductName, Products.UnitPrice AS PrecoLista, [Order Details].UnitPrice AS PrecoVenda
FROM [Order Details]
JOIN Products ON [Order Details].ProductID = Products.ProductID
WHERE [Order Details].UnitPrice < Products.UnitPrice;