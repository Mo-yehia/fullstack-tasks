<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%--        import Bootstrap--%>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">

    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">

</head>
<body>
    <h1>Product Details</h1>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-group">
                    <label>Product Name:</label>
                    <input type="text" class="form-control" value="${product.name}" readonly/>
                </div>

                <div class="form-group">
                    <label>Expiration Date:</label>
                    <input type="text" class="form-control" value="${product.productDetails.expirationDate}" readonly/>
                </div>

                <div class="form-group">
                    <label>Manufacturer:</label>
                    <input type="text" class="form-control" value="${product.productDetails.manufacturer}" readonly/>
                </div>

                <div class="form-group">
                    <label>Price:</label>
                    <input type="text" class="form-control" value="${product.productDetails.price}" readonly/>
                </div>

                <div class="form-group">
                    <label>Available:</label>
                    <input type="text" class="form-control" value="${product.productDetails.available}" readonly/>
                </div>

                <a href="${pageContext.request.contextPath}/" class="btn btn-secondary mt-3">Back</a>
            </div>
        </div>
    </div>
</body>


</html>