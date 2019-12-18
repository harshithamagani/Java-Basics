<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
public int add(int a,int b){
	return a+b;
}
%>

<% int i=4;
 int j =10;
 %>
 
 <h3><%= add(i,j) %></h3>
 
 <% for( int index =0 ; index<10 ; index++) { %>
 <%= index %>
 <% } %>
</body>
</html>