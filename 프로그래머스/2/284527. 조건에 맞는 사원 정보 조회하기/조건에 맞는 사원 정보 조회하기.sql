-- 코드를 작성해주세요
with score as (
select 
    EMP_NO,
    sum(SCORE) as SCORE
from HR_GRADE
group by EMP_NO
)
select
    s.SCORE,
    e.EMP_NO,
    e.EMP_NAME,
    e.POSITION,
    e.EMAIL
from score s
join HR_EMPLOYEES e on s.EMP_NO = e.EMP_NO
order by SCORE DESC
limit 1;