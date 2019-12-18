<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Team Details Page</title>
</head>
	<body>
	<c:if test="${team != null}">
	  <h1>${team.team_name}</h1>
	  <a href="/team-roster/player">New Player</a>
	  <table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<% int count=0; %>
		<tbody>
			<c:forEach items="${team.team}" var="item">
				<% count++; %>
				<tr>
					<th scope="row"><%= count %></th>
					<td>${item.first_name}</td>
					<td>${item.last_name}</td>
					<% String url = "/team-roster/team?id="+(count-1);
				   request.setAttribute("url", url); %>
					<td><a href="#">Details</a> | <a href="#">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>

	</c:if>
	</body>
</html>