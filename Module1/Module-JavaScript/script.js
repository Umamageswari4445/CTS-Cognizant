// task1_basics.js
console.log("Welcome to the Community Portal");
window.addEventListener("load", () => {
  alert("Page is fully loaded!");
});

// task2_data_types.js
const eventName = "Community Music Night";
const eventDate = "2025-06-15";
let availableSeats = 30;
console.log(`Event: ${eventName} | Date: ${eventDate} | Seats: ${availableSeats}`);
availableSeats--;
console.log(`Seats after registration: ${availableSeats}`);

// task3_conditionals.js
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

// task4_functions.js
function addEvent(eventList, newEvent) {
  eventList.push(newEvent);
}

function registerUser(event) {
  if (event.seats > 0) {
    event.seats--;
    console.log("User registered.");
  }
}

function filterEventsByCategory(events, category) {
  return events.filter(event => event.category === category);
}

function createCategoryTracker() {
  let count = 0;
  return function () {
    count++;
    return count;
  };
}

function dynamicFilter(events, callback) {
  return events.filter(callback);
}

// task5_objects.js
function Event(name, date, category, seats) {
  this.name = name;
  this.date = date;
  this.category = category;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const eventObj = new Event("Workshop", "2025-06-15", "education", 10);
console.log(Object.entries(eventObj));

// task6_arrays.js
let allEvents = [
  { name: "Music Night", category: "music" },
  { name: "Tech Talk", category: "tech" }
];

allEvents.push({ name: "Baking Workshop", category: "food" });

const musicEvents = allEvents.filter(e => e.category === "music");
const displayCards = allEvents.map(e => `Event: ${e.name}`);
console.log(displayCards);

// task7_dom.js
const container = document.querySelector("#events-container");
allEvents.forEach(e => {
  const card = document.createElement("div");
  card.textContent = `${e.name} [${e.category}]`;
  container.appendChild(card);
});

// task8_events.js
document.querySelectorAll(".register-btn").forEach(btn => {
  btn.onclick = () => alert("Registered!");
});

document.querySelector("#categoryFilter").onchange = (e) => {
  console.log(`Filtering by: ${e.target.value}`);
};

document.querySelector("#searchInput").addEventListener("keydown", e => {
  console.log(`Searching: ${e.target.value}`);
});

// task9_async.js
fetch("events.json")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error("Fetch error", err));

async function fetchEvents() {
  try {
    document.body.innerHTML += "<p>Loading...</p>";
    const res = await fetch("events.json");
    const data = await res.json();
    console.log(data);
  } catch (err) {
    console.error(err);
  }
}

// task10_es6.js
function greetUser(name = "Guest") {
  console.log(`Welcome, ${name}`);
}

const eventDetails = { name: "TechFest", date: "2025-06-20" };
const { name, date } = eventDetails;
console.log(name, date);

const clonedEvents = [...allEvents];

// task11_forms.js
const form = document.querySelector("#registrationForm");
form.addEventListener("submit", e => {
  e.preventDefault();
  const { name, email, event } = form.elements;
  if (!name.value || !email.value || !event.value) {
    alert("Please fill all fields");
    return;
  }
  console.log(`User: ${name.value}, Email: ${email.value}, Event: ${event.value}`);
});

// task12_ajax.js
function postRegistration(user) {
  console.log("Sending registration...");
  fetch("https://mockapi.io/register", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(user)
  })
    .then(res => res.json())
    .then(data => {
      console.log("Success", data);
    })
    .catch(err => console.error("Error:", err));

  setTimeout(() => console.log("Simulated delay complete."), 2000);
}

// task13_debug.js
console.log("Submitting form...");
form.addEventListener("submit", e => {
  e.preventDefault();
  debugger;
  const payload = {
    name: form.elements.name.value,
    email: form.elements.email.value,
    event: form.elements.event.value
  };
  console.log("Payload:", payload);
  // Check network tab after fetch
  fetch("https://mockapi.io/register", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(payload)
  });
});

// task14_jquery.js
$(document).ready(() => {
  $('#registerBtn').click(() => alert('Registered via jQuery!'));
  $('.event-card').fadeIn();

  // One benefit of using frameworks like React or Vue:
  // They offer reactive data binding, which automatically updates the UI when data changes.
});
