<%-- 
    Document   : Register
    Created on : 25-Aug-2022, 7:48:12 pm
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ServletCRUD | SignUp</title>
        <style><%@include file="/WEB-INF/signup-login.css" %></style>
    </head>
    <body>
    <div class="container">
        <div class="action">
            <ul>
                <a href="Login" style="color:#c0c0c0;"><li>Login</li></a>
                <a href="Signup" style="color:#ac0202;box-shadow: 0px 0px 20px 1px #e7e7e7;"><li>Sign Up</li></a>
            </ul>
        </div>
        <form action="Signup" method="post">
            <div class="wrapper">
                <label>User Name</label>
                <input type="text" name="username"/>
            </div>
            <div class="wrapper">
                <label>Mobile Number</label>
                <input type="number" name="mobile"/>
            </div>
            <div class="wrapper">
                <label>Password</label>
                <input type="password" name="password"/>
            </div>
            <div class="wrapper">
                <input type="submit" value="Sign Up">
            </div>
        </form>
    </div>
</body>
</html>
