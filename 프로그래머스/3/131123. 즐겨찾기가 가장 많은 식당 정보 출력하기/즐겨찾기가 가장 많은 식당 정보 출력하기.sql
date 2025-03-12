-- 코드를 입력하세요
with temp1 as (
    SELECT
    *,
    MAX(FAVORITES) OVER(PARTITION BY FOOD_TYPE) as "MAX"
from REST_INFO
)
select
    FOOD_TYPE,
    REST_ID,
    REST_NAME,
    FAVORITES
from temp1
where FAVORITES = MAX
group by FOOD_TYPE
order by FOOD_TYPE DESC