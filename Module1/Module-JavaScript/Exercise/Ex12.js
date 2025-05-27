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
