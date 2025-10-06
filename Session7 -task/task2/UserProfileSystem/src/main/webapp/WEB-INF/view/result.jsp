<html>

<head>
    <title>Registration Details</title>
    <!-- Bootstrap -->
       <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
       <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<style>
body {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
  margin: 0;
}

h2 {
  color: #2d3436;
  text-align: center;
  margin-bottom: 25px;
  border-bottom: 2px solid #0984e3;
  display: inline-block;
  padding-bottom: 5px;
}
</style>

</head>

   <body>

       <div class="card">
           <h2>Registration Details</h2>
           <div class="info">
               <p><span>First Name:</span> ${firstName}</p>
               <p><span>Last Name:</span> ${lastName}</p>
               <p><span>Email:</span> ${email}</p>
               <p><span>Date of Birth:</span> ${dob}</p>
               <p><span>City:</span> ${city}</p>
           </div>
           <a href="<%= request.getContextPath() %>/" class="btn">Back</a>
       </div>

   </body>
</html>
