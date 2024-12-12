let url = "http://localhost:8080/javabank5/api/customer"

function getData(url) {
    fetch(url)
    .then((response) => response.json())
    .then((data) => fillTable(data))
    .then((data) => insertTable(data))
    .catch((error) => console.log(error))
}

function insertTable() {
    let addButton = document.querySelector("#add")
    let tableBody = document.querySelector("#customerInfo");

    addButton.addEventListener("click", function () {
        const row = document.createElement(`tr`)

        let firstName = document.querySelector("#first").value;
        let lastName = document.querySelector("#last").value;
        let email = document.querySelector("#email").value;
        let phone = document.querySelector("#phone").value;

        let cellID = document.createElement(`td`);
        cellID.textContent = 2;
        row.appendChild(cellID);

        let firstNameCell = document.createElement(`td`);
        firstNameCell.textContent = firstName;
        row.appendChild(firstNameCell);

        let lastNameCell = document.createElement(`td`);
        lastNameCell.textContent = lastName;
        row.appendChild(lastNameCell);

        let emailCell = document.createElement(`td`);
        emailCell.textContent = email;
        row.appendChild(emailCell);

        let phoneCell = document.createElement(`td`);
        phoneCell.textContent = phone;
        row.appendChild(phoneCell);

        const cellButtonData = document.createElement(`td`);

            const cellDelete = document.createElement(`button`);
            cellDelete.textContent = "Delete";

            cellDelete.addEventListener(`click`, function(){
                row.remove();
            })

            cellButtonData.appendChild(cellDelete);
            row.appendChild(cellButtonData);

            const cellButtonDataEdit = document.createElement(`td`);

            const cellEdit = document.createElement(`button`);
            cellEdit.textContent = "Edit";

            cellEdit.addEventListener("click", function () {
                document.querySelector("#first").value = element.firstName;
                document.querySelector("#last").value = element.lastName;
                document.querySelector("#email").value = element.email;
                document.querySelector("#phone").value = element.phone;
                editingRow = row;
            })

            cellButtonDataEdit.appendChild(cellEdit);
            row.appendChild(cellButtonDataEdit)
            

        tableBody.appendChild(row);

        document.querySelector("#form").reset();
        
    })
}


function fillTable(data){

    let tableBody = document.querySelector("#customerInfo");

        tableBody.innerHTML= "";

        data.forEach((element) => {
            const row = document.createElement('tr'); 

            const cellID = document.createElement(`td`);
            cellID.textContent = element.id;
            row.appendChild(cellID);

            const firstName = document.createElement('td');
            firstName.textContent = element.firstName;
            row.appendChild(firstName);

            const lastName = document.createElement('td');
            lastName.textContent = element.lastName;
            row.appendChild(lastName);

            const cellEmail = document.createElement('td');
            cellEmail.textContent = element.email;
            row.appendChild(cellEmail);

            const cellPhone = document.createElement(`td`);
            cellPhone.textContent = element.phone;
            row.appendChild(cellPhone)

            const cellButtonData = document.createElement(`td`);

            const cellDelete = document.createElement(`button`);
            cellDelete.textContent = "Delete";

            cellDelete.addEventListener(`click`, function(){
                row.remove();
            })

            cellButtonData.appendChild(cellDelete);
            row.appendChild(cellButtonData);

            const cellButtonDataEdit = document.createElement(`td`);

            const cellEdit = document.createElement(`button`);
            cellEdit.textContent = "Edit";

            cellEdit.addEventListener("click", function () {
                document.querySelector("#first").value = element.firstName;
                document.querySelector("#last").value = element.lastName;
                document.querySelector("#email").value = element.email;
                document.querySelector("#phone").value = element.phone;
            })

            cellButtonDataEdit.appendChild(cellEdit);
            row.appendChild(cellButtonDataEdit)

            tableBody.appendChild(row);
        });
}

getData(url);