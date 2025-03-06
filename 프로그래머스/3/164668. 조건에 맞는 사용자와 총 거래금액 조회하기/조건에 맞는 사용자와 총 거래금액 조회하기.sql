-- 코드를 입력하세요
with temp1 as (
    SELECT
    WRITER_ID,
    PRICE
from USED_GOODS_BOARD b
where STATUS = "DONE"
)
select
    t.WRITER_ID,
    u.NICKNAME,
    sum(t.PRICE) as TOTAL_SALES
from temp1 t 
join USED_GOODS_USER u on t.WRITER_ID = u.USER_ID
group by t.WRITER_ID
having sum(t.PRICE) >= 700000
order by TOTAL_SALES


