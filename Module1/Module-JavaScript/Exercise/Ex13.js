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