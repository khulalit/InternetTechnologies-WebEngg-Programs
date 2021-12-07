<%-- 
    Document   : substring
    Created on : 27-Oct-2020, 10:14:54 AM
    Author     : lalit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib uri="/WEB-INF/tlds/taglib"  prefix="t"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SubString </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
         <style>
                 .fix{
                     margin-top: 20%;
                 }
        </style>
    </head>
    <body>
        <div class=" container fixed-top border-bottom border-primary p-3">
            <p class="h6 text-dark">Program 7: Create a custom tag “substring” with 3 mandatory attributes “input”, “start”, “end”
which will do substring operation on given input. </p>
            <p class="h6">Author : Lalit</p>
                <h1 class="text-primary mt-5">Welcome</h1>
                
                
        </div>
        <div class="container p-5 fix" >
            <h5 class=" text-dark">String : ${param.name}<br>Start  : ${param.start}<br>End    : ${param.end} </h5>
            <h2 class="text-danger mt-5">SubString : <t:substr input="${param.name}" start="${param.start}" end="${param.end}"></t:substr></h2>
            
        </div>
        
    </body>
</html>
