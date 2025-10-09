<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>

  <div class="card text-start">
    <h2 class="mb-3 text-primary">Welcome to Spring MVC Form App</h2>

    <form:form action="processForm" modelAttribute="UserModel">
      <div class="mb-3">
        <form:input class="form-control mb-3" placeholder="Enter your name" path="name" />
        <form:password class="form-control mb-3" placeholder="Enter your password" path="password" />

        <!-- Country -->
        <div class="mb-3 text-start">
          <label class="form-label">Country:</label>
          <div class="select-wrapper">
            <form:select path="country" class="form-select stylish-select">
              <form:option value="" label="-- Select your country --" />
              <form:option value="Egypt" label="Egypt" />
              <form:option value="Germany" label="Germany" />
              <form:option value="Canada" label="Canada" />
              <form:option value="Italy" label="Italy" />
            </form:select>
          </div>
        </div>

        <!-- Programming Language -->
        <div class="mb-3 text-start">
          <label class="form-label">Programming Language:</label>
          <div class="option-group">
            <label class="form-check">
              <form:radiobutton path="programingLanguage" value="Java" class="form-check-input" />
              <span class="form-check-label">Java</span>
            </label>
            <label class="form-check">
              <form:radiobutton path="programingLanguage" value="C++" class="form-check-input" />
              <span class="form-check-label">C++</span>
            </label>
            <label class="form-check">
              <form:radiobutton path="programingLanguage" value="C#" class="form-check-input" />
              <span class="form-check-label">C#</span>
            </label>
            <label class="form-check">
              <form:radiobutton path="programingLanguage" value="Python" class="form-check-input" />
              <span class="form-check-label">Python</span>
            </label>
          </div>
        </div>

        <!-- Operating Systems -->
        <div class="mb-3 text-start">
          <label class="form-label">Operating Systems:</label>
          <div class="option-group">
            <label class="form-check">
              <form:checkbox path="operatingSystems" value="Windows" class="form-check-input" />
              <span class="form-check-label">Windows</span>
            </label>
            <label class="form-check">
              <form:checkbox path="operatingSystems" value="macOS" class="form-check-input" />
              <span class="form-check-label">macOS</span>
            </label>
            <label class="form-check">
              <form:checkbox path="operatingSystems" value="Linux" class="form-check-input" />
              <span class="form-check-label">Linux</span>
            </label>
          </div>
        </div>

      </div>
      <button type="submit" class="btn btn-primary w-100">Submit</button>
    </form:form>
  </div>

</body>
</html>
