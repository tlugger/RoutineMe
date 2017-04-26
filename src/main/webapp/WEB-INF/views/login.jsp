<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="resources/css/main.css?nme90=246"/>" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Questrial|Rubik" rel="stylesheet">
    <title>RoutineMe Login</title>
</head>
<body>
<div class="login-container">
    <form:form name="submitForm" method="POST">
        <div align="center">
            <h1>RoutineMe</h1>
            <h3>Create, Share, Practice Routines.</h3>
            <div class="login-block">
                <div class="email-block">
                    <h4 class="email-label">Email</h4>
                    <div><input type="text" name="email" class="field"/></div>
                </div>
                <div class="password-block">
                    <h4 class="password-label">Password</h4>
                    <div><input type="password" name="password" class="field"/></div>
                </div>
                <div class="submit-block">
                    <div></div>
                    <a href="/routineFeed">
                    <div><input type="submit" value="Submit" class="submitButton"/></div>
                    </a>
                </div>
            </div>
            <div style="color: red">${error}</div>
        </div>
    </form:form>
</div>
</body>
</html>

