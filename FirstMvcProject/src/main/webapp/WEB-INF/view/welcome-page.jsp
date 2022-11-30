<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<form action="processOrder">
		<h1 align="center">${myWebsiteTitle}</h1>
		<hr>
		<div align="center">

			<label for="item_name"> Item name:</label>
			 
			<input type="text"	name="foodType" placeholder="food type.. ?" id="item_name">
			<input type="submit" name="ordernow" value="order">
		</div>
	</form>
</body>
</html>