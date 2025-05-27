document.querySelectorAll(".register-btn").forEach(btn => {
  btn.onclick = () => alert("Registered!");
});

document.querySelector("#categoryFilter").onchange = (e) => {
  console.log(`Filtering by: ${e.target.value}`);
};

document.querySelector("#searchInput").addEventListener("keydown", e => {
  console.log(`Searching: ${e.target.value}`);
});