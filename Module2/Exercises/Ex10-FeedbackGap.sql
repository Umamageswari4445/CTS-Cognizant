SELECT 
    e.title
FROM Events e
JOIN Registrations r ON e.id = r.event_id
LEFT JOIN Feedback f ON e.id = f.event_id
GROUP BY e.id
HAVING COUNT(f.id) = 0;