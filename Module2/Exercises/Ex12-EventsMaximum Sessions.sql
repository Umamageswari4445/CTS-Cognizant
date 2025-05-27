SELECT 
    e.title,
    COUNT(s.id) AS session_count
FROM Events e
JOIN Sessions s ON e.id = s.event_id
GROUP BY e.id
ORDER BY session_count DESC
LIMIT 1;