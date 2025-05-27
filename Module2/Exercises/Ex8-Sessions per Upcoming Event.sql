SELECT 
    e.title,
    COUNT(s.id) AS session_count
FROM Events e
LEFT JOIN Sessions s ON e.id = s.event_id
WHERE e.status = 'upcoming'
GROUP BY e.id;