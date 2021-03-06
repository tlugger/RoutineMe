<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="resources/css/main.css?ndse4s4=2f312346"/>" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Questrial|Rubik" rel="stylesheet">
    <title>RoutineMe Login</title>
</head>
<body>
    <div align="center">
        <div class="viewframe">
            <div class="header">
                <a href="routineFeed" class="back-button">&lt; Back</a>
                <div class="routine-image-container">
                <div class="routine-title">
                    <h1>
                        ${routine.getTitle()}
                    </h1>
                </div>
                <div class="routine-author">
                    <h3>
                        ${routine.getAuthor()}
                    </h3>
                </div>
                <div class="routine-date">
                    <h4>
                        ${routine.getDate()}
                    </h4>
                </div>
                <div class="routine-difficulty">
                    <h4>
                        Difficulty: ${routine.getDifficulty()}
                    </h4>
                </div>
                <div class="routine-duration">
                    <h4>
                        Duration: ${routine.getDuration()}
                    </h4>
                </div>
                <div class="routine-rating">
                    <h4>
                        Rating: ${routine.getRating()}
                    </h4>
                </div>

                <div class="routine-description">
                    <p class="routine-review-text">
                        ${routine.getDescription()}
                    </p>
                </div>

                    <img class="routine-image" src="<c:url value="resources/images/${routine.getIndex() % 6}.jpg"/>"/>
                </div>
            </div>
            <div class="action-bar">
                <div class="action-bar-icons">
                    <div class="vote">
                        <form method="POST" action="/RoutineMe/upvote">
                            <a href="upvote">
                                <button type="upvote" name="upvote" value="upvote">
                                <img class="upvote" src="<c:url value="resources/images/upvote.svg"/>"/>
                                </button>
                            </a>
                        </form>
                        <form method="POST" action="/RoutineMe/downvote">
                            <a href="downvote">
                                <button type="downvote" name="downvote" value="downvote">
                                    <img class="downvote" src="<c:url value="resources/images/downvote.svg"/>"/>
                                </button>
                            </a>
                        </form>
                        <div>${routine.getRating()}</div>
                    </div>
                    <div class="start-container">
                        <img class="start" src="<c:url value="resources/images/start.svg"/>"/>
                    </div>
                    <div class="bookmark-container">
                        <img class="bookmark" src="<c:url value="resources/images/bookmark.svg"/>"/>
                    </div>
                </div>
            </div>


            <div class="exercises">
                <c:forEach varStatus="loop" items="${routine.getExercises().getCollection()}" var="exercise">
                    <div class="exercise">
                        <h3>${exercise.getTitle()}</h3>
                        <h4>${exercise.getType()}</h4>
                        <c:forEach varStatus="loop" items="${exercise.getStepCollection().getCollection()}" var="step">
                            <p>${step.getStepText()}</p>
                        </c:forEach>
                    </div>
                </c:forEach>
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

