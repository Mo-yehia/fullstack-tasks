<html>

    <head>
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    </head>

<style>
 body {
   min-height: 100vh;
   background: linear-gradient(135deg, #74b9ff, #a29bfe, #ffeaa7);
   display: flex;
   justify-content: center;
   align-items: center;
   font-family: 'Poppins', sans-serif;
 }

 .card {
   background: #ffffff;
   border: none;
   border-radius: 25px;
   padding: 40px 35px;
   width: 600px;
   box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
   transition: transform 0.3s ease, box-shadow 0.3s ease;
 }

 .card:hover {
   transform: translateY(-5px);
   box-shadow: 0 12px 25px rgba(0, 0, 0, 0.2);
 }



 h5 {
   color: #636e72;
   margin-bottom: 25px;
 }

 .form-control {
   border-radius: 12px;
   padding: 12px;
   border: 1px solid #dfe6e9;
   transition: border-color 0.3s;
 }

 .form-control:focus {
   border-color: #6c5ce7;
   box-shadow: 0 0 5px rgba(108, 92, 231, 0.3);
 }

 button {
   display: inline-block;
   margin-top: 25px;
   padding: 12px 30px;
   background: linear-gradient(135deg, #42a5f5, #1e88e5);
   color: white;
   font-weight: 600;
   font-size: 16px;
   text-decoration: none;
   border-radius: 8px;
   box-shadow: 0 4px 10px rgba(0,0,0,0.15);
   transition: all 0.3s ease;
 }

 button:hover {
     background: linear-gradient(135deg, #64b5f6, #1976d2);
               transform: translateY(-3px);
               box-shadow: 0 6px 14px rgba(0,0,0,0.2);
 }


</style>


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
