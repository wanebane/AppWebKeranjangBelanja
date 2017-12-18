<%-- 
    Document   : header
    Created on : Dec 16, 2017, 11:46:36 AM
    Author     : RomyRivaldy
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/resources/theme1/bootstrap.css" rel="stylesheet">
        <style>
            body{margin:0}
            .navbar {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #265a88;
                position: static;
                top: 0;
                width: 100%;
            }

            .navbar a {
                float: left;
                font-size: 16px;
                color: whitesmoke;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }
            .navbar a:hover {
                background-color: graytext;
            }
        </style>
    </head>
    <body>
        <div class="navbar">
            <a href="${pageContext.request.contextPath}/home">Home</a>
            <a href="#product">Product</a>
            <a style="float:right" href="#login">Login</a>
            <a style="float:right" href="${pageContext.request.contextPath}/register">Register</a>
        </div>
        <div class="container">
            <div class="jumbotron">
                <h1>This is my web</h1>
                <p>Can't you fix it?</p>
            </div>
        </div>
    </body>
</html>
