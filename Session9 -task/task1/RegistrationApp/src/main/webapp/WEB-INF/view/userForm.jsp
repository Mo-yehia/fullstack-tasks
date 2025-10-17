<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>

  <div class="card text-start">
    <h2 class="mb-3 text-primary">Welcome to Registration App</h2>

    <form:form action="processForm" modelAttribute="UserModel" cssClass="needs-validation">

          <!-- Name -->
          <div class="mb-3">
            <label class="form-label">Name</label>
            <form:input class="form-control" placeholder="Enter your name" path="name" required="true" />
            <form:errors path="name" cssClass="text-danger" />
            <div class="invalid-feedback">Please enter your name.</div>
          </div>

          <!-- Email -->
          <div class="mb-3">
            <label class="form-label">Email</label>
            <form:input type="email" class="form-control" placeholder="Enter your email" path="email" required="true" />
            <form:errors path="email" cssClass="text-danger" />
            <div class="invalid-feedback">Please enter a valid email.</div>
          </div>

          <!-- Password -->
          <div class="mb-3">
            <label class="form-label">Password</label>
            <form:password class="form-control" placeholder="Enter your password" path="password" required="true" minlength="6" />
            <form:errors path="password" cssClass="text-danger" />
            <div class="invalid-feedback">Password must be at least 6 characters.</div>
          </div>

          <!-- Confirm Password -->
          <div class="mb-3">
            <label class="form-label">Confirm Password</label>
            <form:password class="form-control" placeholder="Confirm your password" path="confirmPassword" required="true" />
            <form:errors path="confirmPassword" cssClass="text-danger" />
            <div class="invalid-feedback">Passwords do not match.</div>
          </div>


                <button type="submit" class="btn btn-primary w-100">Submit</button>

     </form:form>

  </div>
</div>

</body>
</html>
