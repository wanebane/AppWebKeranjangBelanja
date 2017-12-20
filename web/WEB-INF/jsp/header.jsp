<%-- 
    Document   : header
    Created on : Dec 16, 2017, 11:46:36 AM
    Author     : RomyRivaldy
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
                font-size: 14px;
                color: whitesmoke;
                text-align: center;
                padding: 14px 12px;
                text-decoration: none;
            }
            .navbar a:hover {
                background-color: graytext;
            }
        </style>
    </head>
    <body>
        <div class="navbar">
            <a href="${pageContext.request.contextPath}/home">
                <i class="glyphicon glyphicon-home"></i> Home
            </a>
            <a href="${pageContext.request.contextPath}/product/all">
                <i class="glyphicon glyphicon-list-alt"></i> Product
            </a>
            <a style="float:right" href="${pageContext.request.contextPath}/login">
                <i class="glyphicon glyphicon-log-in"></i> Login
            </a>
            <a style="float:right" href="${pageContext.request.contextPath}/register">
                <i class="glyphicon glyphicon-user"></i> Register
            </a>
            <a style="float:right" href="${pageContext.request.contextPath}/cart/show">
                <i class="glyphicon glyphicon-shopping-cart"></i> Carts : ${cart.carts.size()}
                <!--<span class="badge"> 0</span>-->
            </a>
        </div>
