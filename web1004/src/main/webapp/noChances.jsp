<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Run out of Guess</title>
</head>
<body>
    <h2>System Guess Number is :  ${sessionScope.Fortune.number}</h2>
      Bad news , You are incorrect again and You have no chances.</br>
    <a href="guess.html">New Game</a>
    <% session.invalidate(); %>
</body>
</html>