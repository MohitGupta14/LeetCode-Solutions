# Write your MySQL query statement below
SELECT 
    unique_id , name
From 
  Employees E
LEFT JOIN 
  EmployeeUNI U on E.id = U.id

