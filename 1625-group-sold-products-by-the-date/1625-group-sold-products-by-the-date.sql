SELECT sell_date,COUNT(distinct product) as num_sold, GROUP_CONCAT(distinct product ORDER BY product ASC SEPARATOR ',') as products
FROM Activities
GROUP BY sell_date
