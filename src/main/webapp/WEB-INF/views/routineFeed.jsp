<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="resources/css/main.css?name10=jo5" />" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Questrial|Rubik" rel="stylesheet">
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
        <c:forEach varStatus="loop" items="${routines}" var="routineVar">
            <a href="routine?title=${routineVar.getRoutineHeader().getTitle()}&author=${routineVar.getAuthor()}&date=${routineVar.getDate()}&description=${routineVar.getDescription()}&difficulty=${routineVar.getDifficulty()}&duration=${routineVar.getDuration()}&rating=${routineVar.getRating()}">
                <div class="viewframe">
                    <div class="header">
                        <div class="routine-title">
                            <h1>
                                ${routineVar.getTitle()}
                            </h1>
                        </div>
                        <div class="routine-author">
                            <h3>
                                ${routineVar.getAuthor()}
                            </h3>
                        </div>
                        <div class="routine-date">
                            <h4>
                                ${routineVar.getDate()}
                            </h4>
                        </div>
                        <div class="routine-difficulty">
                            <h4>
                                    Difficulty: ${routineVar.getDifficulty()}
                            </h4>
                        </div>
                        <div class="routine-duration">
                            <h4>
                                    Duration: ${routineVar.getDuration()}
                            </h4>
                        </div>
                        <div class="routine-rating">
                            <h4>
                                    Rating: ${routineVar.getRating()}
                            </h4>
                        </div>

                        <div class="routine-description">
                            <p class="routine-review-text">
                                ${routineVar.getDescription()}
                            </p>
                        </div>
                    </div>
                    <div class="routine-image">
                    </div>
            </a>
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
                    <c:forEach varStatus="loop" items="${routineVar.getReviews().getCollection()}" var="review">
                        <div class="review">
                            <h3>${review.getAuthor()}</h3>
                            <h4>${review.getDate()}</h4>
                            <p>${review.getReviewText()}</p>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </c:forEach>
        </div>
    </div>
</div>
</body>
</html>