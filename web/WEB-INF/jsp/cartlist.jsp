<%-- 
    Document   : cartlist
    Created on : Dec 19, 2017, 1:05:07 PM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carts</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <div class="container">
            <div class="jumbotron">
                <h1>
                    <b> Cart List</b>
                </h1>
            </div>
            <c:if test="${not empty errMsg}" > 
                <p>${errMsg}
                    <a href="${pageContext.request.contextPath}/product/all">See Our Products</a>
                </p>
            </c:if>
            <div class="panel panel-primary">
                <table class="table table-responsive">
                    <tr class="info">
                        <th>Product Name</th>
                        <th></th>
                        <th>Price</th>
                    </tr>
                    <c:forEach items="${cart.carts}" var="car">
                        <tr class="warning">
                            <th>${car.value.productName} </th>
                            <th>
                                <b>
                                    <a href="#" class="btn btn-danger">
                                        <i class="glyphicon glyphicon-remove"></i> Remove
                                    </a>
                                </b>
                            </th>
                            <th>Rp. ${car.value.price}</th>
                        </tr>
                    </c:forEach>
                    <tr class="success">
                        <th>Total</th>
                        <th></th>
                        <th>Rp. </th>
                    </tr>
                </table>
            </div>

            <ul class="pager">
                <li class="previous"><a href="${pageContext.request.contextPath}/product/all">Belanja Lagi</a></li>
                <li class="next"><a href="#">Next</a></li>
            </ul>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
