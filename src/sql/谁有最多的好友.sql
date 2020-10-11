-- 将 requester_id 和 accepter_id 联合起来 [Accepted]
-- 算法
--
-- 成为朋友是一个双向的过程，所以如果一个人接受了另一个人的请求，他们两个都会多拥有一个朋友。
--
-- 所以我们可以将 requester_id 和 accepter_id 联合起来，然后统计每个人出现的次数。
-- select requester_id as ids from request_accepted
-- union all--不去重
-- select accepter_id from request_accepted;
select ids from id, cnt as num from(
select ids,count(*) as cnt from (
 select requester_id as ids from request_accepted
union all--不去重
select accepter_id from request_accepted;
) as tb11 group by ids
)as tb12
order by cnt desc limit 1;