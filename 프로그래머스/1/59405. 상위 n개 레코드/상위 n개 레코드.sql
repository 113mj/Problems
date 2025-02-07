-- 코드를 입력하세요
with MIN_TABLE as (
    SELECT
    NAME,
    DATETIME,
    MIN(DATETIME) OVER() as MIN_DATE
from ANIMAL_INS
)
select
    NAME
from MIN_TABLE
where MIN_DATE = DATETIME