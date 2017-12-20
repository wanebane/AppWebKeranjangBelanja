<%-- 
    Document   : detail
    Created on : Dec 18, 2017, 2:31:41 PM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${product.productName}</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <div class="container">
            <div class="jumbotron">
                <h1><b>Product Detail</b></h1>
            </div>
        </div>     
        <div class="container">
            <table class="table table-responsive">
                <thead>
                    <tr>
                        <th>${product.productName}</th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="success">
                        <td>Price</td>
                        <td>${product.price}</td>
                    </tr>
                    <tr class="info">
                        <td>Stock</td>
                        <td>${product.stock}</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
