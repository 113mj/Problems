-- FISH_INFO 테이블에서 잡은 BASS와 SNAPPER의 수를 출력하는 SQL 문을 작성해주세요.
-- 컬럼명은 'FISH_COUNT`로 해주세요.
SELECT
    COUNT(ID) AS FISH_COUNT
from FISH_INFO i
join FISH_NAME_INFO n on i.FISH_TYPE = n.FISH_TYPE
where n.FISH_NAME IN ('BASS', 'SNAPPER');