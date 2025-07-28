# Write your MySQL query statement below
SELECT teacher_id,
Count(DISTINCT subject_id) as cnt
FROM Teacher
Group By teacher_id 