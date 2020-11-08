select a.name as Employee
from Employee as a,
      Employee as b
where a.ManagerId=b.Id and a.Salary>b.Salary;

select a.name as Employee
from Employee as a join Employee as b
 on a.ManagerId =b.Id and a.Salary>b.Salary;