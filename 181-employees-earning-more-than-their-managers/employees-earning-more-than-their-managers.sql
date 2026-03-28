# Write your MySQL query statement below
SELECT em.name AS Employee
FROM Employee AS e
INNER JOIN Employee AS em ON e.id = em.managerId
WHERE e.salary<em.salary;