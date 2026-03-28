# Write your MySQL query statement below
SELECT e2.name AS Employee
FROM Employee e1, Employee e2
WHERE e1.id = e2.managerId AND e1.salary < e2.salary;