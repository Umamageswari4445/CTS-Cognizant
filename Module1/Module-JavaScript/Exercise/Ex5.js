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