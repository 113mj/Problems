-- 코드를 입력하세요
-- 중성화 여부를 확인한 뒤 새로운 컬럼에 추가한다?
SELECT
    ANIMAL_ID,
    NAME,
    IF(SEX_UPON_INTAKE LIKE "%Neutered%" OR SEX_UPON_INTAKE LIKE "%Spayed%", "O", "X") AS "중성화"
from ANIMAL_INS