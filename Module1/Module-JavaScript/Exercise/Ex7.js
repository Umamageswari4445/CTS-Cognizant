const container = document.querySelector("#events-container");
allEvents.forEach(e => {
  const card = document.createElement("div");
  card.textContent = `${e.name} [${e.category}]`;
  container.appendChild(card);
});