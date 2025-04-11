with temp1 as (
    SELECT
    *,
    max(PRICE) OVER(PARTITION BY CATEGORY) as MAX_PRICE
from FOOD_PRODUCT
)
SELECT
    CATEGORY,
    MAX_PRICE,
    PRODUCT_NAME
from temp1
where MAX_PRICE = PRICE and CATEGORY in ('과자', '국', '김치', '식용유')
order by MAX_PRICE DESC
    