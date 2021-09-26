<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2021, 11:20:52 AM
    Author     : 854292
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age:</label>
            <input type="number" name="age" value="${userAge}">
            <br>
            <input type="submit" value="Age next birthday">
        </form> 
        <a href="arithmetic">Arithmetic Calculator</a>
        <br>
        <p>${ageMessage}</p>     
    </body>
</html>
