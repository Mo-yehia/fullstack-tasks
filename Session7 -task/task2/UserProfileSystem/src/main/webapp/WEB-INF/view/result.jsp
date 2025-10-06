<html>

<head>
    <title>Registration Details</title>
    <!-- Bootstrap -->
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    <style>
           body {
               display: flex;
               justify-content: center;
               align-items: center;
               height: 100vh;
               font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
               margin: 0;
           }

           .card {
               background-color: #ffffff;
               width: 500px;
               padding: 25px 30px;
               border-radius: 15px;
               box-shadow: 0 6px 15px rgba(0,0,0,0.15);
               transition: transform 0.3s ease;
           }

           .card:hover {
               transform: scale(1.02);
           }

           h2 {
               color: #2d3436;
               text-align: center;
               margin-bottom: 25px;
               border-bottom: 2px solid #0984e3;
               display: inline-block;
               padding-bottom: 5px;
           }

           .info {
               margin-top: 10px;
           }

           .info p {
               font-size: 17px;
               margin: 10px 0;
               background-color: #f8f9fa;
               padding: 8px 12px;
               border-radius: 8px;
           }

           .info span {
               font-weight: bold;
               color: #0984e3;
               display: inline-block;
               width: 130px;
           }

           a.btn {
               display: block;
               text-align: center;
               background-color: #0984e3;
               color: white;
               padding: 10px 0;
               border-radius: 8px;
               text-decoration: none;
               margin-top: 20px;
               font-weight: 500;
               transition: background-color 0.3s ease;
           }

           a.btn:hover {
               background-color: #74b9ff;
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
