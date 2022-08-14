# Write your MySQL query statement below
SELECT name FROM Customer where id in(
select id from Customer where referee_id!=2 or referee_id is NULL
);