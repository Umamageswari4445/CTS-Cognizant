SELECT 
    u.full_name,
    u.city AS user_city,
    e.title AS event_title,
    e.city AS event_city,
    e.start_date,
    e.end_date
FROM Users u
JOIN Registrations r ON u.id = r.user_id
JOIN Events e ON r.event_id = e.id
WHERE 
    e.status = 'upcoming'
    AND u.city = e.city
ORDER BY e.start_date;
