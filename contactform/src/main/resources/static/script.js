document.getElementById("contactForm").addEventListener("submit", function (event) {

    event.preventDefault();

    const contact = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        message: document.getElementById("message").value
    };

    fetch("/submit", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(contact)
    })
    .then(response => response.json())
    .then(data => {
        alert("Contact Saved Successfully!");

        document.getElementById("contactForm").reset();
    })
    .catch(error => {
        console.error(error);
        alert("Something went wrong!");
    });

});