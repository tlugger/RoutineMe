<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link href="<c:url value="resources/css/main.css?some_var_to_bust_cache=24312346" />" rel="stylesheet">
    <title>RoutineMe</title>
</head>
<body>
<div class="wrapper">
    <div class="nav-bar-container">
        <div class="nav-bar"></div>
    </div>
    <div class="feed-container">
        <div class="feed">
        <h1>RoutineMe</h1>
        <h3>Create, Share, Practice Routines.</h3>

        <p>Welcome, ${firstName}</p>
        <c:forEach varStatus="loop" items="${routines}" var="routine">
            <div class="viewframe">
                <a href="routine?title=${routine.getRoutineHeader().getTitle()}&author=${routine.getRoutineHeader().getAuthor()}&date=${routine.getRoutineHeader().getDate()}&description=${routine.getRoutineHeader().getDescription()}">
                    <p>
                        ${routine.getRoutineHeader().getTitle()}
                    </p>
                </a>
            </div>
        </c:forEach>
        </div>
    </div>
</div>
</body>
</html>