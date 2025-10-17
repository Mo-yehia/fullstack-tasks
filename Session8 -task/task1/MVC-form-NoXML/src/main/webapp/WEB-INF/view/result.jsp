<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Form Result</title>
    <!-- Bootstrap -->
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
 </head>


   <body>

     <div class="card text-start">
       <h2 class="mb-4 text-success">Form Submitted Successfully!</h2>

       <div class="result-box text-start">
         <h5 class="mb-3 text-primary">Here are your details:</h5>

         <p><strong>Name:</strong> <span class="text-dark">${UserModel.name}</span></p>
         <p><strong>Password:</strong> <span class="text-dark">${UserModel.password}</span></p>
         <p><strong>Country:</strong> <span class="text-dark">${UserModel.country}</span></p>
         <p><strong>Programming Language:</strong> <span class="text-dark">${UserModel.programingLanguage}</span></p>

         <p><strong>Operating Systems:</strong></p>
         <ul class="list-group mb-3">
           <c:forEach var="os" items="${UserModel.operatingSystems}">
             <li class="list-group-item">${os}</li>
           </c:forEach>
         </ul>

       <a href="${pageContext.request.contextPath}/" class="btn btn-primary w-100 mt-3">Back to Form</a>
     </div>

   </body>


</html>
