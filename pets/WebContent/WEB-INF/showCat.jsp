<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cat Page</title>
</head>
<body>
	You created a <c:out value="${cat.breed}"></c:out><br>
	<c:out value="${cat.showAffection()}"></c:out>
</body>
</html>