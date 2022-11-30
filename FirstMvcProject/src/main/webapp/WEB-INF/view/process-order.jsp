<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
span{
color:red;
font-family:Arial;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your order is  recieved!!</h1>
Order <span> ${userInput}</span>  is in processing mode
<%! String salutations=LocalTime.now().getHour()>12?"Good Afternoon":"Good Morning"; %>
<h1> <%= salutations+" "+request.getParameter("foodType") %></h1>
</body>
</html>