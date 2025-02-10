-- 코드를 입력하세요
-- 상반기 아이스크림 총 주문량이 3000보다 높으면서
-- 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문
SELECT
    f.FLAVOR
from FIRST_HALF f
join ICECREAM_INFO i on f.FLAVOR = i.FLAVOR
where f.TOTAL_ORDER > 3000
and i.INGREDIENT_TYPE = "fruit_based"
order by f.TOTAL_ORDER DESC;