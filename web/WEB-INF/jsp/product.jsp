<%-- 
    Document   : product
    Created on : Dec 18, 2017, 3:56:41 PM
    Author     : RomyRivaldy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <div class="container">
            <div class="jumbotron">
                <h1>
                    <b> Product List</b> 
                </h1>
            </div>
        </div>
        <div class="panel panel-primary">
            <div class="panel-heading">Tabel Product</div>
            <table class="table">
                <tr class="success">
                    <th>Product</th>
                    <th>Price</th>
                    <th>Stock</th>
                    <th>Note</th>
                </tr>
                <c:forEach var="c" items="${product}">
                    <tr class="warning">
                        <td><a href="${c.id}">${c.productName}</a></td>
                        <td>${c.price}</td>
                        <td>${c.stock}</td>
                        <td>
                            <button class="btn btn-success"><i class="glyphicon glyphicon-shopping-cart"></i> Add</button>
                            <!--<button class="btn btn-info"><i class="glyphicon glyphicon-info-sign"></i> Detail</button>-->
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <jsp:include page="footer.jsp"/>
    </body>
</html>
