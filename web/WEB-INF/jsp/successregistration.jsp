<%-- 
    Document   : successregistration
    Created on : Dec 18, 2017, 9:23:34 AM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/resources/theme1/css/bootstrap.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <div class="container">
            <h1>Registration Success</h1>
            ${data.firstName} ${data.lastName}
            <p>
                <a href="${pageContext.request.contextPath}/login">Please Login</a>
            </p>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
