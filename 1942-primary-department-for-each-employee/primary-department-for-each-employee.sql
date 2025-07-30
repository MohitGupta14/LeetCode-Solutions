# Write your MySQL query statement below
SELECT employee_id, department_id
FROM Employee e1
WHERE primary_flag = 'Y'
   OR NOT EXISTS (
       SELECT 1 
       FROM Employee e2
       WHERE e2.employee_id = e1.employee_id AND e2.primary_flag = 'Y'
   );
