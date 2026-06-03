SELECT
    u.full_name,
    COUNT(*) AS total_events
FROM users u
JOIN events e
ON u.user_id = e.organizer_id
GROUP BY u.full_name
ORDER BY total_events DESC
LIMIT 1;