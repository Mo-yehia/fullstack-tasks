<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%-- Import Bootstrap --%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>">
</head>
<body>
<div class="tbl-div">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">All Products</th>
            <th scope="col"></th>
            <th scope="col"></th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>

                <!-- View Details Form -->
                <td>
                    <form action="${pageContext.request.contextPath}/showProductDetails" method="get">
                        <input type="hidden" name="id" value="${item.id}"/>
                        <input type="submit" class="btn btn-primary" value="View Details"/>
                    </form>
                </td>

                <!-- Update Form -->
                <td>
                    <form action="${pageContext.request.contextPath}/update" method="get">
                        <input type="hidden" name="id" value="${item.id}"/>
                        <input type="submit" class="btn btn-warning" value="update Details"/>
                    </form>
                </td>

                <!-- Delete Form -->
                <td>
                    <form action="${pageContext.request.contextPath}/delete" method="get">
                        <input type="hidden" name="id" value="${item.id}"/>
                        <input type="submit" class="btn btn-danger" value="Delete"/>
                    </form>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

    <!-- Add new Product -->
    <form:form action="${pageContext.request.contextPath}/add" method="get">
        <input type="submit" class="btn btn-success" value="Add new Product"/>
    </form:form>
</div>
</body>
</html>
