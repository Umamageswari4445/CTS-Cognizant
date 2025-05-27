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