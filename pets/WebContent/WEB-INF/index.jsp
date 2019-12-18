<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pets Form</title>
<style type="text/css">
#wrapper{
width:950px;
margin: 0 auto;
}
#dog-section{
display: inline-block;
border: solid black 1px;
margin : 20px;
}
#cat-section{
display: inline-block;
border: solid black 1px;
margin : 20px;
}
form{
padding:50px;
}

</style>
</head>
<body>
	<div id="wrapper">
		<div id="dog-section">
		<p>Make a Dog!!</p>
			<form action="/pets/dog" method="GET">
				<label>Name</label>
				<input name="name" type="text"><br>
				<label>Breed</label>
				<input name="breed" type="text"><br>
				<label>Weight(lb)</label>
				<input name="weight" type="text"><br> 
				<input name="submit" type="submit" value="Submit">
			</form>
		</div>
		<div id="cat-section">
		<p>Make a Cat!!</p>
		<form action="/pets/cat" method="GET">
			<label>Name</label>
			<input name="name" type="text"><br> 
			<label>Breed</label>
			<input name="breed" type="text"><br> 
			<label>Weight(lb)</label>
			<input name="weight" type="text"> <br> 
			<input name="submit" type="submit" value="Submit">
		</form>
		</div>
	</div>
</body>
</html>