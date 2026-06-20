# Write your MySQL query statement below
select s.name 
from salesPerson S
where s.name not in (select S.name 
from SalesPerson S
left join Orders O
on S.sales_Id = O.sales_Id
left join Company C
on C.com_id = O.com_id
where C.name = "Red")