<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2021, 7:08:42 PM
    Author     : 854292
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First Number:</label>
            <input type='number' name='first' value='${firstNumber}'>
            <br>
            <label>Second Number:</label>
            <input type='number' name='second' value='${secondNumber}'>
            <br>
            <input type='submit' name="submit" value='+'>
            <input type='submit' name="submit" value='-'>
            <input type='submit' name="submit" value='*'>
            <input type='submit' name="submit" value='%'>
        </form>
        <a href='age'>Age Calculator</a>
        <p>${answer}</p>
    </body>
</html>
