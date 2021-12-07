<%-- 
    Document   : order
    Created on : 27-Oct-2020, 9:51:32 PM
    Author     : lalit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="d-flex pt-5 pb-5">
                <header class="text-dark h3  flex-column">
                    Hello ${name}
            </header>
            </div>
            <hr class="bg-primary mb-5">
            <div class="text-center border round bg-secondary p-5">
                <h2 class="text-white ">You have selected ${param.select}</h2>
            </div>
            <div class=" text-primary fixed-bottom m-5">
                <hr class="bg-primary">
                <h3 class="text-secondary">Thank You for buying.</h3>
            </div>
                
        </div>
        <style>
            .round{
                border-radius: 20px 0px;
            }
        </style>
    </body>
</html>
