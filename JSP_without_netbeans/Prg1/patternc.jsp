<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Printing the Pattern using c:forEach loop</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	</head>
	<body>
		<div class="heading">
			<h1 class="text-danger text-center">Printing the pattern </h1>
		</div>
		<div class="container-fluid">
			<% int n=Integer.parseInt((request.getParameter("name")));
		
		%>
		<c:forEach var="i" begin="1" end="${param.name}">			<c:forEach var="j" begin="1" end="${i}">	
				<c:out value="${j}"/>
			</c:forEach>
			<br>
		</c:forEach>
		</div>
		
	</body>
</html>
