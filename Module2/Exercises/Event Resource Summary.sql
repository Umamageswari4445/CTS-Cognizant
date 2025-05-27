SELECT 
    e.title,
    COUNT(r.id) AS total_resources
FROM Events e
LEFT JOIN Resources r ON e.id = r.event_id
GROUP BY e.id;