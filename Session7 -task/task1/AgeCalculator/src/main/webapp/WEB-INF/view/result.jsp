<html>

<head>
    <title>Age Calculator Result</title>
    <!-- Bootstrap -->
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
 </head>


    <body>
        <div class="card text-center">
            <h2 class="mb-3 text-primary">Age Calculator Result</h2>

           <div class="age-box mt-3">
               <h3 class="text-success">Your age is:</h3>

               <h4><span class="text-dark">${years}</span> years</h4>
               <h4><span class="text-dark">${months}</span> months</h4>
               <h4><span class="text-dark">${days}</span> days</h4>
           </div>

            <a href="<%= request.getContextPath() %>/" class="btn-calc-again">Calculate Again</a>

        </div>
    </body>
</html>
