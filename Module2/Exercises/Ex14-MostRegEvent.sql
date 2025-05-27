SELECT 
    e.title,
    COUNT(r.user_id) AS total_registrations
FROM Events e
JOIN Registrations r ON e.id = r.event_id
GROUP BY e.id
ORDER BY total_registrations DESC
LIMIT 3;