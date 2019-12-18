<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create player page</title>
	<style type="text/css">
		#wrapper{
			text-align: center;
		}
		input{
		margin:2px;
		}
	</style>
</head>
<body>
	<div id="wrapper">
	<h1>Create New Player</h1>
		<form action="/team-roster/player" method="post">
			  <label>First name</label>
			  <input name="first-name" type="text"><br>
			  <label>Last name</label>
			  <input name="last-name" type="text"><br>
			  <label>Age</label>
			  <input name="age" type="text"><br>
			  <input name="submit" value="Submit" type="submit">
		</form>
	</div>
</body>
</html>