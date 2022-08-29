<%-- 
    Document   : Update
    Created on : 29-Aug-2022, 11:24:06 am
    Author     : ACER
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ServletCRUD | Update</title>
        <style><%@include file="/WEB-INF/signup-login.css" %></style>
    </head>
    <body>
    <div class="container">
        <form action="Update?id=${user.getId()}" method="post">
            <div class="wrapper">
                <label>User Name</label>
                <input type="text" value="${user.getUsername()}" name="username"/>
            </div>
            <div class="wrapper">
                <label>Mobile Number</label>
                <input type="number"  value="${user.getMobile()}"  name="mobile"/>
            </div>
            <div class="wrapper">
                <label>Password</label>
                <input type="password"  value="${user.getPassword()}"  name="password"/>
            </div>
            <div class="wrapper">
                <input type="submit" value="Update">
            </div>
        </form>
    </div>
</body>
</html>
