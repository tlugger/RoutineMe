<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="resources/css/main.css?some_var_to_bust_cache=24312346"/>" rel="stylesheet">
    <title>RoutineMe Login</title>
</head>
<body>
<form:form name="submitForm" method="POST">
    <div align="center">
        <h1>RoutineMe</h1>
        <h3>Create, Share, Practice Routines.</h3>
        <table>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" class="field"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" class="field"/></td>
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

