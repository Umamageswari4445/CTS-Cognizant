SELECT 
    e.organizer_id,
    COUNT(e.id) AS total_events,
    e.status
FROM Events e
GROUP BY e.organizer_id, e.status;