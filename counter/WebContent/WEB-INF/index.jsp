<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#wrapper{
	width:950px;
	height:100px;
	margin: 0 auto;
	}
	#container{
	text-align: center;
	margin-top:200px;
	}
</style>
</head>
<body>
<div id="wrapper">
	<div id="container">
		<button id="counter" onclick="window.location.href='/counter'">Click Me!</button>
		<h1>You have clicked this button <c:out value="${counter}"></c:out> times</h1>
	</div>
</div>
</body>
</html>