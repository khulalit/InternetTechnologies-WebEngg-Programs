<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result</title>
    <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>
    <div class="m-3 mt-20 mx-10 rounded-lg bg-gray-800 p-3">
        <%String option = request.getParameter("choose").toString();
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
        int result;
        StringBuilder output = new StringBuilder("n/a");
        String h ;
        if(option.equals("1")){
            output.setLength(0);
            output.append("Addition");
            result = number1+number2;
            h = "of ";
        }
        else if(option.equals("2")){
            output.setLength(0);
            output.append("Subtraction");
            result = number1-number2;
            h = "between ";
        }
        else{
            output.setLength(0);
            output.append("Multiplication");
            result = number1*number2;
            h = "of ";
        }
        
      out.print("<h1 class='text-white font-sans text-4xl text-center'>Result for the "+ output+" "+ h + number1 +" and "+number2+" is : </h1>");
      out.print("<h1 class='text-center text-white font-sans text-6xl mt-20'>"+ result +"</h1>");
        %>
    </div>
    
</body>
</html>