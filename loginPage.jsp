<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="light blue">
<br>


<spring:form action="/HospitalManagementSystem/login" modelAttribute="login"> 
Username: <spring:input type="text" path="username"/>  <br>
Password: <spring:input type="text" path="password"/>  <br>
<input type= "submit" value= "Login"/>

</spring:form>


</body>
</html>