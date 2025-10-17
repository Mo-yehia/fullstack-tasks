<html>

    <head>
      <title>User Registration</title>

      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    </head>

</head>
<body>

    <form action ="saveData" >
      <h2 class="text-center mb-4">User Registration</h2>

      <div class="mb-3">
        <label for="firstName" class="form-label">First Name</label>
        <input type="text" name="firstName" id="firstName" class="form-control" placeholder="Enter first name" required>
      </div>

      <div class="mb-3">
        <label for="lastName" class="form-label">Last Name</label>
        <input type="text" name="lastName" id="lastName" class="form-control" placeholder="Enter last name" required>
      </div>

      <div class="mb-3">
        <label for="email" class="form-label">Email Address</label>
        <input type="email" name="email" id="email" class="form-control" placeholder="Enter email" required>
      </div>

      <div class="mb-3">
        <label for="dob" class="form-label">Date of Birth</label>
        <input type="text" name="dob" id="dob" class="form-control" placeholder="DD-MM-YYYY" required>
      </div>

      <div class="mb-3">
        <label for="city" class="form-label">City</label>
        <input type="text" name="city" id="city" class="form-control" placeholder="Enter city" required>
      </div>

      <button type="submit" class="btn btn-primary">Submit</button>
    </form>

</body>
</html>
