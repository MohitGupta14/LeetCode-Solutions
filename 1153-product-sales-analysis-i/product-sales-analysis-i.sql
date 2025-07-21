# Write your MySQL query statement below
SELECT 
    product_name,year,price
FROM 
    Product P
JOIN 
   Sales s on s.product_id = P.product_id
