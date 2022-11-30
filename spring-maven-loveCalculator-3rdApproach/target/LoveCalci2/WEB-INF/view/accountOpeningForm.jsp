<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="createAccount" modelAttribute="account">
 FirstName <form:input path="customer.fname"/><br/>
 LastName<form:input path="customer.lname"/><br/>
 Age<form:input path="customer.age"/><br/>
 Amount<form:input path="balance"/><br/>
 <hr/>
 City<form:input path="addr.city"/><br/>
 Pin<form:input path="addr.pin" /><br/>
 <input type="submit" value="createAccount"/>
</form:form>

</body>
</html>