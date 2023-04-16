-- 코드를 입력하세요
SELECT COUNT(*) AS 'USERS'
  FROM (
            SELECT *
              FROM USER_INFO
             WHERE YEAR(JOINED) = '2021'
       ) AS USER_INFO
 WHERE USER_INFO.AGE BETWEEN 20 AND 29;