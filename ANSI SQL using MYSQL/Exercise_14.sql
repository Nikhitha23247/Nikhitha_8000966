SELECT
    u.user_id,
    u.full_name,
    COUNT(r.event_id) AS total_events
FROM users u
JOIN registrations r
ON u.user_id = r.user_id
GROUP BY u.user_id, u.full_name
HAVING COUNT(r.event_id) > 1;