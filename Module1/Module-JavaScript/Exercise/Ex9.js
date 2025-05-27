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