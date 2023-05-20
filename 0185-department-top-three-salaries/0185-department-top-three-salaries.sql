# Write your MySQL query statement below
select temp.Department, temp.Employee, temp.Salary from
(select d.name as Department, e.name as Employee, e.Salary,
dense_rank() over(partition by e.departmentId order by e.salary desc) as ranking
from Employee e join Department d on e.departmentId = d.id) as temp
where ranking<=3;

