SELECT 
    e.city,
    AVG(f.rating) AS average_rating
FROM Feedback f
JOIN Events e ON f.event_id = e.id
GROUP BY e.city;