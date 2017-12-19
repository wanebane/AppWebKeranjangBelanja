<%-- 
    Document   : loginform
    Created on : Dec 18, 2017, 11:25:27 AM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/theme1/css/bootstrap.css">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <h1>
                    <b> Login Form</b>
                </h1>
            </div>
            <form class="form-horizontal">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input id="username" type="text" class="form-control" name="username" placeholder="Username">
                </div>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                    <input id="password" type="password" class="form-control" name="password" placeholder="Password">
                </div>
                <br/>
                <button type="submit" class="btn btn-primary">
                    <span class="glyphicon glyphicon-log-in"> <b>Login</b></span>
                </button>
            </form>
        </div>

    </body>
</html>