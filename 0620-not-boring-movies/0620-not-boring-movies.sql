# Write your MySQL query statement below
select *
from cinema
where (id%2=1) and
(description is not null and description!= "boring")
order by rating desc;