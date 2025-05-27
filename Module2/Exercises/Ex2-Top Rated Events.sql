SELECT 
    e.title,
    AVG(f.rating) AS average_rating,
    COUNT(f.id) AS feedback_count
FROM Events e
JOIN Feedback f ON e.id = f.event_id
GROUP BY e.id
HAVING COUNT(f.id) >= 10
ORDER BY average_rating DESC;