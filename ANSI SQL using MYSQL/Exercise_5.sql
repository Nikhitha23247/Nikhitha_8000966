SELECT
    e.city,
    COUNT(DISTINCT r.user_id) AS total_users
FROM registrations r
JOIN events e
    ON r.event_id = e.event_id
GROUP BY e.city
ORDER BY total_users DESC
LIMIT 5;