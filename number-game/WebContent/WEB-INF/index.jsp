<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Number Game</title>
	<style type="text/css">
        #wrapper{
        	width:980px;
        	matgin: 0 auto;
        	border : solid black 1px;
        	text-align: center;
        }
        h1{
			text-align: center;
		}
		.highlow {
            width: 100px;
            height: 100px;
            border : solid black 1px;
            text-align: center;
        }
        
	</style>
</head>
<body>
	<div id="wrapper">
	<h1>Welcome to the Great Number Game!</h1>
	<p>I am thinking of a number between 1 to 100</p>
	<a href="/number-game/destory">Restart</a>
			<form action="/number-game/" method="POST">
				<input name="number" id="number" type="text">
				<input name="submit" name="submit" type="submit" value="Submit">
			</form>
			<c:if test="${guessResult == 'tooHight'}">
				 <div class="highlow">
				 	<h2>Too High!!</h2>
				 </div>
			 </c:if>
			<c:if test="${guessResult == 'tooLow'}">
				 <div class="highlow">
				 	<h2>Too Low!!</h2>
				 </div>
			 </c:if>
			 <c:if test="${guessResult == 'Correct'}">
			 <div class="highlow">
		        <h2>Correct</h2>
		    </div>
		    </c:if>
	    </div>
</body>
</html>