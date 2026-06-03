SELECT
    u.user_id,
    u.full_name,
    u.city,
    e.title
FROM users u
JOIN registrations r
    ON u.user_id = r.user_id
JOIN events e
    ON r.event_id = e.event_id
WHERE u.city = e.city;