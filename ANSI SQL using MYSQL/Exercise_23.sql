SELECT
    MONTH(registration_date) AS month,
    COUNT(*) AS total_registrations
FROM registrations
GROUP BY MONTH(registration_date)
ORDER BY month;