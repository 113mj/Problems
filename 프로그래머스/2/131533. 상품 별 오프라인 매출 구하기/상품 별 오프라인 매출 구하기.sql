with temp1 as (
    SELECT
        PRODUCT_ID,
        sum(SALES_AMOUNT) as "count"
    From OFFLINE_SALE
    group by PRODUCT_ID
)
select 
    p.PRODUCT_CODE,
    t.count * p.price as "SALES"
from PRODUCT p
join temp1 t on p.PRODUCT_ID = t.PRODUCT_ID
order by SALES DESC, p.PRODUCT_CODE