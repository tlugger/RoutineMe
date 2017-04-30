<%@ page import="spring.controllers.RoutineHeader"%>
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
    <title>RoutineMe Draft</title>
</head>
<body>
<div class="draft-container">
    <form:form name="submitForm" method="POST">
        <div align="center">
            <%--<h1>RoutineMe</h1>--%>
            <%--<h3>Create, Share, Practice Routines.</h3>--%>
            <div class="draft-block">
                <div class="header-block">
                    <div class = "draft-title">
                        <h4 class="routine-title">Title</h4>
                        <%--<div>${routine.setTitle(<input type="text" name="title" class="field"/>)}</div>--%>
                        <div><input type="text" name="title" class="field"/></div>

                </div>
                    <div class = "draft-author">
                        <h4 class="routine-author">Author</h4>
                        <div><input type="text" name="author" class="field"/></div>
                    </div>
                    <div class = "draft-date">
                        <h4 class="routine-date">Date</h4>
                        <div><input type="text" name="date" class="field"/></div>
                    </div>
                    <div class = "draft-difficulty">
                        <h4 class="routine-difficulty">Difficulty</h4>
                        <div><input type="text" name="difficulty" class="field"/></div>
                    </div>
                    <div class = "draft-duration">
                        <h4 class="routine-duration">Duration</h4>
                        <div><input type="text" name="duration" class="field"/></div>
                    </div>
                    <div class = "draft-description">
                        <h4 class="routine-description">Description</h4>
                        <div><input type="text" name="description" class="field"/></div>
                    </div>
                    <div class = "draft-exercise">
                        <h4 class="draft-exercise-title">First Exercise Title</h4>
                        <div><input type="text" name="exerciseTitle" class="field"/></div>
                        <h4 class="draft-exercise-type">Exercise Type</h4>
                        <div><input type="text" name="exerciseType" class="field"/></div>
                        <div class = "draft-step">
                            <h4 class="draft-step-title">First Step Title</h4>
                            <div><input type="text" name="step1" class="field"/></div>
                        </div>
                        <div class = "draft-step">
                            <h4 class="draft-step-title">Second Step Title</h4>
                            <div><input type="text" name="step2" class="field"/></div>
                        </div>
                        <div class = "draft-step">
                            <h4 class="draft-step-title">Third Step Title</h4>
                            <div><input type="text" name="step3" class="field"/></div>
                        </div>
                    </div>

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
