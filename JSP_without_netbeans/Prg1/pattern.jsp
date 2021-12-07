<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Printing the Pattern using the java for loop</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	</head>
	<body>
		<div class="heading">
			<h1 class="text-danger text-center">Printing the pattern </h1>
		</div>
		<div class="container-fluid m-3">
			<div class="canva">
				<% int n=Integer.parseInt((request.getParameter("name")));
			int i,j;
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
					out.print(j);
				out.println("<br>");
			}
			%>
			</div>
			
		</div>
		
	</body>
</html>