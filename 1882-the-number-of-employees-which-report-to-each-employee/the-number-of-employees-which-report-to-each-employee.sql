SELECT 
    m.employee_id,m.name,
    COUNT(e.reports_to) as reports_count,
    ROUND(AVG(e.age)) as average_age
FROM Employees e
JOIN Employees m ON e.reports_to = m.employee_id
Group By employee_id
Order By employee_id;
