<%-- 
    Document   : product
    Created on : 27-Oct-2020, 9:16:28 PM
    Author     : lalit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <c:set scope="session" var="name" value="${param.name}"></c:set>
        <c:set var="age" value="${param.age}"></c:set>
        <c:choose>
            <c:when test="${age>=15}">
                <div class="container">
                <div class="d-flex pt-5 pb-5">
                    <header class="text-dark h3  flex-column">
                        Hello ${param.name}. Welcome to our site.
                </header>
                </div>
                <hr class="bg-primary mb-5">
                <form action="order.jsp" method="get">
                    <select name="select" class="custom-select custom-select-md mb-3" id="product">
                        <option selected>Open this select menu to select product</option>
                        <option value="Product one">Product One</option>
                        <option value="Product two">Product Two</option>
                        <option value="Product three">Product Three</option>
                    </select>
                    <input type="submit" id='btn' class="btn btn-primary" value="Buy">
                </form>
            </div>
             <div class=" text-primary fixed-bottom m-5">
                    <hr class="bg-primary">
                    <h3 class="text-secondary">Thank You for choosing us.<br>You are ${name} and ${param.age} year old.</h3>
             </div>

            
            </c:when>
            <c:otherwise>
                <div class="container  text-center m-5">
                    <div class="card text-center">
                        <div class="card-body h3 text-white bg-danger p-5">
                            You must be atlest 15 to order.
                            <br>Redirecting you to home page after 3 seconds.
                            <script>
                               setTimeout(function(){ window.location = "/Program10/"; }, 3000);
                            </script>
                        </div>
                    </div>

                </div>
            </c:otherwise>
        </c:choose>
        
        
    </body>
</html>
