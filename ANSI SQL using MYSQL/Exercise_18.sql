SELECT
    e.title,
    COUNT(r.user_id) AS total_registrations
FROM events e
LEFT JOIN registrations r
    ON e.event_id = r.event_id
GROUP BY e.event_id, e.title;