SELECT
    e.title,
    COUNT(*) AS total_sessions
FROM events e
JOIN sessions s
    ON e.event_id = s.event_id
GROUP BY e.title
HAVING COUNT(*) > 1;