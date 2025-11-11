<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%--        import Bootstrap--%>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">

    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">

</head>
<body>
    <h1>Add new Product</h1>
       <form:form method="post" action="${pageContext.request.contextPath}/save" modelAttribute="product">
            <div class="container mt-5">
                <div class="row justify-content-center">
                    <div class="col-md-6">
                        <div class="form-group">
                            <h3>Add Product</h3>
                        </div>

                        <div class="form-group">
                            <label for="name">Product Name</label>
                            <form:input type="text" cssClass="form-control" path="name" placeholder="Enter product name"/>
                            <form:errors path="name" cssClass="error"/>
                        </div>

                        <div class="form-group">
                            <label for="expirationDate">Expiration Date</label>
                            <form:input type="text" cssClass="form-control" path="productDetails.expirationDate" placeholder="dd/mm/yyyy"/>
                            <form:errors path="productDetails.expirationDate" cssClass="error"/>
                        </div>

                        <div class="form-group">
                            <label for="manufacturer">Manufacturer</label>
                            <form:input type="text" cssClass="form-control" path="productDetails.manufacturer" placeholder="Manufacturer"/>
                            <form:errors path="productDetails.manufacturer" cssClass="error"/>
                        </div>

                        <div class="form-group">
                            <label for="price">Price</label>
                            <form:input type="text" cssClass="form-control" path="productDetails.price" placeholder="Price"/>
                            <form:errors path="productDetails.price" cssClass="error"/>
                        </div>

                        <div class="form-group">
                            <form:checkbox path="productDetails.available" cssClass="form-check-input"/>
                            <label for="available">Availability</label>
                        </div>

                        <input type="submit" class="btn btn-primary"/>
                    </div>
                </div>
            </div>
        </form:form>

</body>

</html>