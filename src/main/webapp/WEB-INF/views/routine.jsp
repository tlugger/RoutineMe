<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="resources/css/main.css?name10444=24312346"/>" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Questrial|Rubik" rel="stylesheet">
    <title>RoutineMe Login</title>
</head>
<body>
    <div align="center">
        <div class="viewframe">
            <div class="header">
                <div class="routine-title">
                    <h1>
                        ${routine.reviews.getCollection()[0].getAuthor()}
                    </h1>
                </div>
                <div class="routine-author">
                    <h3>
                        ${author}
                    </h3>
                </div>
                <div class="routine-date">
                    <h4>
                        ${date}
                    </h4>
                </div>
                <div class="routine-difficulty">
                    <h4>
                        Difficulty: ${difficulty}
                    </h4>
                </div>
                <div class="routine-duration">
                    <h4>
                        Duration: ${duration}
                    </h4>
                </div>
                <div class="routine-rating">
                    <h4>
                        Rating: ${rating}
                    </h4>
                </div>

                <div class="routine-description">
                    <p class="routine-review-text">
                        ${description}
                    </p>
                </div>
            </div>
            <div class="action-bar">
                <div class="action-bar-icons">
                    <div class="vote">
                        <img class="upvote" src="<c:url value="resources/images/upvote.svg"/>"/>
                        <img class="downvote" src="<c:url value="resources/images/downvote.svg"/>"/>
                    </div>
                    <div class="start-container">
                        <img class="start" src="<c:url value="resources/images/start.svg"/>"/>
                    </div>
                    <div class="bookmark-container">
                        <img class="bookmark" src="<c:url value="resources/images/bookmark.svg"/>"/>
                    </div>
                </div>
            </div>
            <div class="reviews">
                <c:forEach varStatus="loop" items="${reviews.getCollection()}" var="review">
                    <div class="review">
                        <h3>${review.getAuthor()}</h3>
                        <h4>${review.getDate()}</h4>
                        <p>${review.getReviewText()}</p>
                    </div>
                </c:forEach>
            </div>
        </div>
        </div>
    </div>
</body>
</html>

