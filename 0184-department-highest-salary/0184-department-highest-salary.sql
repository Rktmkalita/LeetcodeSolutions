# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.Salary from Employee e join Department d
on e.departmentId = d.id where (e.departmentId, e.Salary) in (select departmentId, max(salary) from employee group by departmentId);

