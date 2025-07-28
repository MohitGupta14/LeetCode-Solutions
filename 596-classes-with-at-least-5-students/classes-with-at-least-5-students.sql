# Write your MySQL query statement below
SELECT class
From Courses
group By class
HAVING COUNT(class) > 4;
