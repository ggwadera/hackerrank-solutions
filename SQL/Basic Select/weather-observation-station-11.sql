SELECT DISTINCT CITY
FROM STATION
WHERE CITY LIKE '%[^aeiouAEIOU]' OR CITY LIKE '[^aeiouAEIOU]%';