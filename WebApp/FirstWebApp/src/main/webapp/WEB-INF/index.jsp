<html>
    <head>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <div class="card text-center">
            <div class="card-header">
                JAVABANK CUSTOMER #1
            </div>
            <div class="card-body">
                <h5 class="card-title">Welcome ${customer.name}</h5>
                <p class="card-text">Email: ${customer.email}</p>
                <a href="#" class="btn btn-primary">PhoneNumber: ${customer.phoneNumber}</a>
            </div>
            <div class="card-footer text-body-secondary">
                2 days ago
            </div>
        </div>
    </body>
</html>