<html>

    <head>
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    </head>

<body>

  <div class="card text-center">
    <h2 class="mb-3 text-primary"> welcome to the age calculator</h2>
    <h5>Enter your birth date to calculate your age</h5>

    <form action="calculateAge">
      <div class="mb-3">
        <input type="number" class="form-control mb-3" placeholder="Year" name="year" min="1900" max="2025" required>
        <input type="number" class="form-control mb-3" placeholder="Month" name="month" min="1" max="12" required>
        <input type="number" class="form-control mb-4" placeholder="Day" name="day" min="1" max="31" required>
      </div>
      <button type="submit" class="btn w-100">Calculate</button>
    </form>
  </div>

</body>
</html>
