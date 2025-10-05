<html>

<head>
    <title>Age Calculator Result</title>
    <!-- Bootstrap -->
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

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

       .age-box {
           display: flex;
           justify-content: center;
           align-items: center;
           gap: 20px;
           margin-top: 15px;
       }

       .age-box h4 {
           background-color: #f1f8ff;
           padding: 10px 20px;
           border-radius: 8px;
           box-shadow: 0 2px 5px rgba(0,0,0,0.1);
           margin: 0;
       }

        .btn-calc-again {
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

        .btn-calc-again:hover {
            background: linear-gradient(135deg, #64b5f6, #1976d2);
            transform: translateY(-3px);
            box-shadow: 0 6px 14px rgba(0,0,0,0.2);
        }

    </style>
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
