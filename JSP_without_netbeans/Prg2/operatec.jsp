<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
<link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-800">
    <h1 class='text-white font-sans text-6xl text-center mt-6'>Result is : </h1>
    <c:set value="${param.number1}" var="number1"/>
    <c:set value="${param.number2}" var="number2"/>
    <c:set value="${param.choose}" var="x"/>
    <c:choose>
        <c:when test="${x==1}">
            <h1 class='text-center text-white font-sans text-6xl mt-20'><c:out value="${number1+number2}"/></h1>
        </c:when>
        <c:when test="${x==2}">
            <h1 class='text-center text-white font-sans text-6xl mt-20'><c:out value="${number1-number2}"/></h1>
        </c:when>
        <c:when test="${x==3}">
            <h1 class='text-center text-white font-sans text-6xl mt-20'><c:out value="${number1*number2}"/></h1>
        </c:when>
        <c:when test="${x==4}">
            <h1 class='text-center text-white font-sans text-6xl mt-20'><c:out value="${number1+number2}"/></h1>
        </c:when>
        <c:otherwise>
            <c:out value="Wrong choice"/>
        </c:otherwise>
    </c:choose>
</body>
</html>