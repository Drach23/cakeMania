


function EnviarDatos() {
    const firstName = document.getElementById("inputName").value;
    const lastName = document.getElementById("inputLastName").value;
    const phone = document.getElementById("inputPhone").value;
    const email = document.getElementById("inputEmail").value;
    const username = document.getElementById("inputUsername").value;
    const password = document.getElementById("inputPassword").value;
    const endpoint = "http://localhost:8080/auth/register";

    
        fetch(endpoint, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            name: firstName,
            lastName: lastName,
            phone: phone,
            email: email,
            username: username,
            password: password,
        }),
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        console.log('Success:', data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
}
