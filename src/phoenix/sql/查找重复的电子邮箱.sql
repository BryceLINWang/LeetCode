select Email from Person
group by Email having count(Email) >1;

select Email from
(select Email ,count(Email) as num from Person group by Email) as a #必须as
where num >1;