<%-- 
    Document   : home
    Created on : 26-Oct-2020, 10:13:11 PM
    Author     : lalit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib uri="/WEB-INF/tlds/taglib"  prefix="t"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
         <style>
                 .fix{
                     margin-top: 20%;
                 }
        </style>
    </head>
    <body>
        <div class=" container fixed-top border-bottom border-primary p-3">
            <p class="h6 text-dark">Program 6 </p>
            <p class="h6">Author : Lalit</p>
                <h1 class="text-primary mt-5">Welcome <t:hello uname="${param.name}"></t:hello></h1>
                
                
        </div>
        <div class="container fix text-center text-dark">
            <h1>You have choosed "${param.select}"</h1>
            
            <br>
            <span class="h3">
                <t:choco texture="${param.select}"></t:choco>
            </span>
            
        </div>
        
        
    </body>
</html>
