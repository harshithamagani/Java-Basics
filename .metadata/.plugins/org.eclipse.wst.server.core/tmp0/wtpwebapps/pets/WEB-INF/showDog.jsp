<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dog Page</title>
</head>
<body>
   You created a <c:out value="${dog.breed}"/>
   <c:out value="${dog.showAffection()}"></c:out>
</body>
</html>