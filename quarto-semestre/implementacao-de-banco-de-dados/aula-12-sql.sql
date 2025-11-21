IF OBJECT_ID('vw_FuncionariosNaoChefes', 'V') IS NOT NULL
    DROP VIEW vw_FuncionariosNaoChefes;
GO
CREATE VIEW vw_FuncionariosNaoChefes AS
SELECT e.EmployeeID, e.FirstName, e.LastName, e.Title
FROM Employees e
WHERE e.EmployeeID NOT IN (
    SELECT DISTINCT ReportsTo FROM Employees WHERE ReportsTo IS NOT NULL
);
GO

IF OBJECT_ID('vw_VendasPorProduto', 'V') IS NOT NULL
    DROP VIEW vw_VendasPorProduto;
GO
CREATE VIEW vw_VendasPorProduto AS
SELECT 
    p.ProductID,
    p.ProductName,
    SUM(od.Quantity) AS TotalVendido
FROM [Order Details] od
JOIN Products p ON p.ProductID = od.ProductID
GROUP BY p.ProductID, p.ProductName;
GO

IF OBJECT_ID('vw_TerritoriosVendedores', 'V') IS NOT NULL
    DROP VIEW vw_TerritoriosVendedores;
GO
CREATE VIEW vw_TerritoriosVendedores AS
SELECT 
    t.TerritoryID,
    t.TerritoryDescription,
    COUNT(et.EmployeeID) AS QuantidadeVendedores
FROM Territories t
LEFT JOIN EmployeeTerritories et ON et.TerritoryID = t.TerritoryID
GROUP BY t.TerritoryID, t.TerritoryDescription;
GO

IF OBJECT_ID('vw_ClienteMaiorVenda', 'V') IS NOT NULL
    DROP VIEW vw_ClienteMaiorVenda;
GO
CREATE VIEW vw_ClienteMaiorVenda AS
SELECT TOP 1
    c.CustomerID,
    c.CompanyName AS NomeCliente,
    o.OrderID,
    SUM(od.Quantity * od.UnitPrice * (1 - od.Discount)) AS ValorTotal
FROM Orders o
JOIN [Order Details] od ON o.OrderID = od.OrderID
JOIN Customers c ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerID, c.CompanyName, o.OrderID
ORDER BY ValorTotal DESC;
GO

IF OBJECT_ID('vw_VendedoresPorLucro', 'V') IS NOT NULL
    DROP VIEW vw_VendedoresPorLucro;
GO
CREATE VIEW vw_VendedoresPorLucro AS
SELECT 
    e.EmployeeID,
    e.FirstName,
    e.LastName,
    SUM(od.Quantity * od.UnitPrice * (1 - od.Discount)) AS TotalVendas
FROM Employees e
JOIN Orders o ON o.EmployeeID = e.EmployeeID
JOIN [Order Details] od ON od.OrderID = o.OrderID
GROUP BY e.EmployeeID, e.FirstName, e.LastName
ORDER BY TotalVendas DESC;
GO

IF OBJECT_ID('vw_ProdutosDisponiveis', 'V') IS NOT NULL
    DROP VIEW vw_ProdutosDisponiveis;
GO
CREATE VIEW vw_ProdutosDisponiveis AS
SELECT 
    p.ProductID,
    p.ProductName,
    s.CompanyName AS Fornecedor,
    c.CategoryName AS Categoria,
    p.UnitPrice AS Preco,
    CASE 
        WHEN p.Discontinued = 1 THEN 'Descontinuado'
        ELSE 'Ativo'
    END AS Status
FROM Products p
JOIN Suppliers s ON s.SupplierID = p.SupplierID
JOIN Categories c ON c.CategoryID = p.CategoryID
WHERE p.UnitsInStock > 0;
GO
