<%-- 
    Document   : server
    Created on : 26-Oct-2020, 6:22:52 PM
    Author     : lalit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Win | loss </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class=" container fixed-top border-bottom border-primary p-3">
                <h1 class="text-primary mt-5">Welcome</h1>
                
        </div>
        <div class="text-center container fix" id="vanish">
            
            <c:set var="stri" value="${param.word}"/> <br>
            <c:set var="str1" value="${fn:toLowerCase(stri)}"/>
            <c:set var="str2" value="${fn:replace(str1,' ','')}"/>
            <c:set var="str"  value="${str2}"/>
            <c:set var="end"  value="$"/>
            <%--<c:out value="${str2}"/>--%>
            <%--<c:out value="${fn:join(str2,'$')}"/>--%>
            <h2 class="text-primary ">You have entered "${stri}".<br></h2>
            <h5 class="text-dark">Processed word is  "${str2}".</h5>
            <c:set var="vowels" value="aeiou"/>
            <c:set var="isWon" value="${false}"/>
            <c:set var="isContinue" value="${false}"/>
            <c:choose>
                <c:when test="${param.select == 'odd'}">
                    <c:if test="${fn:length(str2)%2 != 0}">
                        
                        <c:set var="str" value="${str2}${end}"/>
                        <%--<c:out value="${str}"/>--%>
                    </c:if>
                    <c:forEach var="i" begin="1" step="2" end="${fn:length(str)}">
                <%--<c:out value="${i}"/>--%>
                        <c:choose>
                            <c:when test="${isContinue}">
                                 <c:when test="${fn:substring(str,i,i+1) == 'a'||fn:substring(str,i,i+1) == 'e'||fn:substring(str,i,i+1) == 'i'||fn:substring(str,i,i+1) == 'o'||fn:substring(str,i,i+1) == 'u'|| fn:substring(str,i,i+1) == '$'}">                                          
                                    <c:set var="isWon" value="${true}"/>
                                    <c:out value="${fn:substring(str,i,i+1)}"/>
                                </c:when>
                                <c:otherwise>
                                    <c:out value="seted to false"/><br>
                                    <c:out value="${fn:substring(str,i,i+1)}"/>
                                    <c:set var="isWon" value="${false}"/>
                                
                                </c:otherwise>
                            </c:when>
                           
                            
                            <c:otherwise>
                               <c:out value="seted to false"/><br>
                               <c:out value="${fn:substring(str,i,i+1)}"/>
                                <c:set var="isWon" value="${false}"/>
                                
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </c:when>
                <c:when test="${param.select == 'even'}">
                    <c:if test="${fn:length(str2)%2 == 0}">
                        
                        <c:set var="str" value="${str2}${end}"/>
                        <c:out value="${str}"/>
                    </c:if>
                    <c:forEach var="i" begin="0" step="2" end="${fn:length(str)}">
                <%--<c:out value="${i}"/>--%>
                        <c:choose>
                            <c:when test="${isContinue}">
                                <c:when test="${fn:substring(str,i,i+1) == 'a'||fn:substring(str,i,i+1) == 'e'||fn:substring(str,i,i+1) == 'i'||fn:substring(str,i,i+1) == 'o'||fn:substring(str,i,i+1) == 'u'||fn:substring(str,i,i+1) == '$'}">
                                
                                    <c:set var="isWon" value="${true}"/>
                                    
                                </c:when>
                                
                                <c:otherwise>
                                    <c:set var="isWon" value="${false}"/>
                                
                                </c:otherwise>
                            
                            </c:when>
                            
                            <c:otherwise>
                                <c:set var="isWon" value="${false}"/>
                                
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <script>
                        document.getElementById('vanish').innerHTML = "";
                        alert("Please select any option either odd or even.You are being redirected to home page.");
                        window.location = '/Program5/'
                    </script>
                </c:otherwise>
            </c:choose>
            <c:choose>
                <c:when test="${isWon == true}">
                    <h1 class="text-success mt-5" >You won ! Well played.</h1>
                </c:when>
                <c:otherwise>
                    <h1 class="text-danger mt-5" >Oops ! Better luck next time.</h1>
                </c:otherwise>
            </c:choose>
             <div class=" container fixed-bottom border-top border-primary p-3">
                <h1 class="text-primary mt-5">Thanks for playing.</h1>
             </div>
        </div>
             <style>
                 .fix{
                     margin-top: 20%;
                 }
             </style>
    </body>
</html>
