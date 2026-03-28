# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers AS c
LEFT JOIN Orders ON c.id = Orders.CustomerId
WHERE Orders.CustomerId IS NULL ;