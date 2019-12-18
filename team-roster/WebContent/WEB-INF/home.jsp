<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<meta charset="UTF-8">
	<title>Home Page</title>
	<style type="text/css">
	#wrapper{
	text-align: center;
	}
	</style>
</head>
<body>
	<div id="wrapper">
		<h1>Prototype Roster</h1>
		<a href="/team-roster/team">New Team</a>
		<p>Team Player Action</p>
		<% int count=0; %>
		<c:if test="${listTeams != null}">
			<div id="content">
				<table class="table">
							  <thead>
							    <tr>
							      <th scope="col">#</th>
							      <th scope="col">Team Name</th>
							      <th scope="col">Size</th>
							      <th scope="col">Action</th>
							    </tr>
							  </thead>
							   <tbody>
									<c:forEach items="${listTeams}" var="item">
										<% count++; %>
											    <tr>
											      <th scope="row"><%= count %></th>
											      <td>${item.team_name}</td>
											      <td>${fn:length(item.team)}</td>
											      <% String url = "/team-roster/team?id="+(count-1);
														request.setAttribute("url", url);						      
											      %>
											      <td><a href="${url}">Details</a> | <a href="#">Delete</a></td>
											    </tr>
									</c:forEach>
							  </tbody>
				</table>
			</div>
		</c:if>
	</div>
</body>
</html>