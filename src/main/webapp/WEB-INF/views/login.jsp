<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
    <title>Spring Login Form</title>
</head>
<body>
<form:form name="submitForm" method="POST">
    <div align="center">
        <table>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" class="Field"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" class="Field"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Submit" class="submitButton"/></td>
            </tr>
        </table>
        <div style="color: red">${error}</div>
    </div>
</form:form>
</body>
</html>

