# Write your MySQL query statement below
select w2.id from weather w1, weather w2 where date_add(w1.recordDate, interval 1 day)=w2.recordDate and w1.temperature<w2.temperature;