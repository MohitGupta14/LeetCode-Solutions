# Write your MySQL query statement below
SELECT e.employee_id
FROM Employees e
where e.salary < 30000 AND e.manager_id is not NULL
  AND manager_id NOT IN (SELECT employee_id FROM Employees)
Order By e.employee_id