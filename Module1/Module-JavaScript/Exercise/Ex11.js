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
