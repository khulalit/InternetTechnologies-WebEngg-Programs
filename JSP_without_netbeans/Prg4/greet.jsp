<%-- 
    Document   : greet
    Created on : 15-Oct-2020, 11:33:06 AM
    Author     : lalit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib uri="/WEB-INF/tlds/taglib"  prefix="t"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greet</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <style>
                 .fix{
                     margin-top: 20%;
                 }
        </style>
    </head>
    <body>
        <div class=" container fixed-top border-bottom border-primary p-3">
            <p class="h6 text-dark">Program 4 : Display Good Morning <uname>, Good Afternoon <uname> or Good Evening
<uname> based on the current time of the day. </p>
            <p class="h6">Author : Lalit</p>
                <h1 class="text-primary mt-5"><t:uname uname="${param.uname}"></t:uname></h1>
                
                
        </div>
        
        
    </body>
</html>
