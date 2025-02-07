-- 코드를 입력하세요
with count_table as (
SELECT
    USER_ID, 
    PRODUCT_ID,
    count(*) AS count_num
from ONLINE_SALE
group by USER_ID, PRODUCT_ID
order by USER_ID, PRODUCT_ID DESC
    )
    select
    USER_ID,
    PRODUCT_ID
    from count_table
    where count_num > 1;