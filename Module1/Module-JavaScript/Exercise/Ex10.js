function greetUser(name = "Guest") {
  console.log(`Welcome, ${name}`);
}

const eventDetails = { name: "TechFest", date: "2025-06-20" };
const { name, date } = eventDetails;
console.log(name, date);

const clonedEvents = [...allEvents];