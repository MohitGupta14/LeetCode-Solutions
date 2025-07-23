# Write your MySQL query statement below
SELECT id,movie,description,rating
FROM Cinema c
WHERE id%2 !=  0 and description != "boring"
Order by rating desc