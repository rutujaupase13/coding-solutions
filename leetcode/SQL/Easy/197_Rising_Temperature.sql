# Write your MySQL query statement below
-- We use a self-join to compare each day's temperature with the previous day's temperature.

SELECT W1.id AS Id
FROM Weather W1
JOIN Weather W2
    ON DATEDIFF(W1.recordDate, W2.recordDate) = 1
WHERE W1.temperature > W2.temperature;
-- DATEDIFF(W1.recordDate, W2.recordDate) = 1 joins a record with the record from the previous day.
-- W1 represents the current day and W2 represents the previous day.
-- W1.temperature > W2.temperature keeps only the days where the temperature increased compared to the previous day.
-- We use dates instead of IDs because IDs do not necessarily represent consecutive days.

-- Time Complexity: O(n²) (self-join approach)