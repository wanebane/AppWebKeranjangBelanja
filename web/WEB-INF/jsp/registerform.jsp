<%-- 
    Document   : registerform
    Created on : Dec 18, 2017, 10:58:54 AM
    Author     : RomyRivaldy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <h1><b>Registration Form</b></h1>
            </div>
            <form class="form-horizontal">
                <div class="input-group">
                    <span class="input-group-addon">Firstname</span>
                    <input id="fn" type="text" class="form-control" name="fn" placeholder="Input your firstname">
                </div>
                <div class="input-group">
                    <span class="input-group-addon">Lastname</span>
                    <input id="ln" type="text" class="form-control" name="ln" placeholder="Input your lastname">
                </div>

                <div class="input-group">
                    <span class="input-group-addon">Email</span>
                    <input id="email" type="email" class="form-control" name="email" placeholder="yourmail@example.com">
                </div>
                <br/><br/>          
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input id="username" type="text" class="form-control" name="username" placeholder="Username">
                </div>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                    <input id="password" type="password" class="form-control" name="password" placeholder="Password">
                </div>
                <br/>
                <button type="submit" class="btn btn-success">
                    <span class="glyphicon glyphicon-edit"> Submit</span>
                </button>
            </form>
        </div>
    </body>
</html>