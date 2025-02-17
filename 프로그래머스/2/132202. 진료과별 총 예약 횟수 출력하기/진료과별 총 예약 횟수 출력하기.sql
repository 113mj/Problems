SELECT
    MCDP_CD AS "진료과코드",
    count(PT_NO) AS "5월예약건수"
from APPOINTMENT
where YEAR(APNT_YMD) = 2022
and MONTH(APNT_YMD) = 5
group by MCDP_CD
ORDER BY 5월예약건수, 진료과코드;