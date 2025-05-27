let allEvents = [
  { name: "Music Night", category: "music" },
  { name: "Tech Talk", category: "tech" }
];

allEvents.push({ name: "Baking Workshop", category: "food" });

const musicEvents = allEvents.filter(e => e.category === "music");
const displayCards = allEvents.map(e => `Event: ${e.name}`);
console.log(displayCards);