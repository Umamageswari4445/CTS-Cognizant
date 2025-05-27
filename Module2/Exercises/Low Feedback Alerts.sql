SELECT 
    u.full_name,
    f.comments,
    f.rating,
    e.title AS event_title
FROM Feedback f
JOIN Users u ON f.user_id = u.id
JOIN Events e ON f.event_id = e.id
WHERE f.rating < 3;