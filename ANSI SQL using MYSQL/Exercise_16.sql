SELECT
    e.event_id,
    e.title,
    AVG(f.rating) AS average_rating
FROM events e
JOIN feedback f
    ON e.event_id = f.event_id
GROUP BY e.event_id, e.title
HAVING AVG(f.rating) > 4;