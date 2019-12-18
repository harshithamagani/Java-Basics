<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <style>
        #wrapper {
            width: 950px;
            margin: 0px auto;
        }

        #subcontent{
            margin: 0px auto;
        }

        .col {
            min-height: 20px;
            width: 20px;
            background-color:lightskyblue;
            display: inline-block;  
        }
    </style>
    <title>Checker Board</title>
</head>
<body>
    <div id="wrapper">
       <div id="subcontents">
       <% 
       int num1 = 0;
       int num2 = 0;
       String color1;
       String color2;
       if(request.getParameter("num1")!= null && request.getParameter("num2") !=null){ 
        	num1=Integer.parseInt(request.getParameter("num1")); 
        	num2=Integer.parseInt(request.getParameter("num2"));
       }else{
    	    num1=8;
    	    num2=8;
       }
       if(request.getParameter("color1")!= null && request.getParameter("color2") !=null){ 
    	   color1 =  request.getParameter("color1");
    	   color2 = request.getParameter("color2");
       }
       else{
    	   color1 = "blue";
    	   color2 = "red";
       }
       %>
       <% for(int m=0;m<num1;m++) { %>
       <div class="row"></div>
       <% for(int n=0;n<num2;n++) { %>
       <% if((m+n)%2 != 0){ %>
       <div class='col' style="background-color:red"></div>
       <% } %>
       <% if((m+n)%2 == 0) { %>
       <div class='col' style="background-color:black"></div>
       <% } %>
       <% } %>
       <% } %>
       </div>
    </div>
</body>
</html>