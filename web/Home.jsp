
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ServletCRUD | Home</title>
        <style><%@include file="/WEB-INF/home.css" %></style>
    </head>
    <body>
    <div class="dashboard-container">
        <table>
            <thead>
                <tr>                  
                    <th>Name</th>
                    <th>Mobile Number</th>
                    <th><a href="/UserAuth/Signup" class="SignUpBtn">Sign Up</a></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach  var="user" items="${users}" >
                
                <tr>
                  
                    <td>${user.getUsername()}</td>
                    <td>${user.getMobile()}</td>
                    <td><a href="/UserAuth/Update?id=${user.getId()}" class="view">VIEW</a></td>
                    <td><a href="/UserAuth/Delete?id=${user.getId()}" class="delete">DELETE</a></td>
                </tr>
                
                </c:forEach>
               
            </tbody>
        </table>
    </div>
</body>
</html>
