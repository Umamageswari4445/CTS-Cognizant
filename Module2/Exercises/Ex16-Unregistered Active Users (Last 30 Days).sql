SELECT u.user_id, u.full_name
FROM Users u
WHERE u.registration_date >= CURDATE() - INTERVAL 30 DAY
AND NOT EXISTS (
    SELECT 1 FROM Registrations r WHERE r.user_id = u.user_id
);