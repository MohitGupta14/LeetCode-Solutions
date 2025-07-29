# Write your MySQL query statement below
SELECT user_id,CONCAT(UPPER(LEFT(name, 1)), LOWER(SUBSTRING(name, 2))) AS name
FROM Users
Order BY user_id
