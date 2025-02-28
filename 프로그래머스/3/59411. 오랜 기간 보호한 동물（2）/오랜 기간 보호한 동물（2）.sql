with sub_date as(
SELECT
    i.ANIMAL_ID,
    i.NAME,
    o.DATETIME - i.DATETIME as temp
from ANIMAL_INS i
join ANIMAL_OUTS o on i.ANIMAL_ID = o.ANIMAL_ID

)
SELECT
    ANIMAL_ID,
    NAME
from sub_date
order by temp DESC
limit 2;