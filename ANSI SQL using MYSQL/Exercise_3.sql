SELECT
    user_id,
    full_name,
    email
FROM users
WHERE user_id NOT IN
(
    SELECT user_id
    FROM registrations
    WHERE registration_date >= CURDATE() - INTERVAL 90 DAY
);