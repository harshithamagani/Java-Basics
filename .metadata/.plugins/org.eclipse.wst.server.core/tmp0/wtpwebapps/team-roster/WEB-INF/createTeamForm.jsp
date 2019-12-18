<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Team Form</title>
	<style type="text/css">
		#wrapper{
			text-align: center;
		}
	</style>
</head>
<body>
	<div id="wrapper">
		<h1>Create a new team</h1>
		<form action="/team-roster/team" method="POST">
			<input id="team-name" name="team-name" type="text">
			<input id="submit" name="submit" type="submit" value="Submit">
		</form>
	</div>
</body>
</html>