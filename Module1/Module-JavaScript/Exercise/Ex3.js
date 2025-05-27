const events = [
  { name: "Tech Meetup", date: "2025-06-10", seats: 0 },
  { name: "Food Fest", date: "2025-07-01", seats: 25 }
];

const today = new Date("2025-06-01");
events.forEach(event => {
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(`Valid Event: ${event.name}`);
  } else {
    console.log(`Invalid Event: ${event.name}`);
  }
});

try {
  const event = events[0];
  if (event.seats <= 0) throw new Error("Event is full!");
  event.seats--;
  console.log("User registered successfully!");
} catch (err) {
  console.error(err.message);
}