<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>Validate</title>
    <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'>
    <link rel='stylesheet' href= '../style.css'>
</head>
<body>

    <%
    
        
            
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");
        String favfood = request.getParameter("favfood");
        String gender = request.getParameter("gender");
        String lno = request.getParameter("lno");
        String select = request.getParameter("select");
        String remark = request.getParameter("remark");

        String value_array[] = {fname, email, lno, remark, favfood};
        //out.print(Arrays.toString(value_array));
        boolean[] match_array = new boolean[5];
        match_array[0] = value_array[0].matches("[a-zA-Z]{3,20}");
        match_array[1] = value_array[1].matches("[a-zA-Z0-9]+['@']gmail.com");
        match_array[2] = value_array[2].matches("[0-9]+");
        match_array[3] = value_array[3].matches("[a-zA-Z]{20,200}");
        match_array[4] = value_array[4].matches("[a-zA-Z ]+");
        //System.out.println(match_array[0]);
       

        if(!match_array[0]){
            out.print("<script>alert('Please enter correct name');window.location='/it/program3/index.html';</script>");

        }
        if(!match_array[1]){
            out.print("<script>alert('Please enter correct email');window.location='/it/program3/index.html';</script>");
            
        }  
        if(!match_array[2]){
            out.print("<script>alert('Please give valid number');window.location='/it/program3/index.html';</script>");
            
        }
        if(!match_array[3]){
            out.print("<script>alert('Remark should not be empty,please write atlest one line.');window.location='/it/program3/index.html';</script>");
            
        }
        if(!match_array[4]){
            out.print("<script>alert('Please enter valid Food.');window.location='/it/program3/index.html';</script>");
        }        
        //System.out.println(select1);
    %>
    <div class='result ' id='result'>
    <h1 class='text-center text-danger'>Form Details</h1> 
    <table class='table table-bordered'>
        <tbody class='p-3'>
            <tr>
                <td scope='row'>Name</td>
                <td scope='row'><%
                String nfname = fname.substring(0,1).toUpperCase() + fname.substring(1);
                String nlname = lname.substring(0,1).toUpperCase() + lname.substring(1);
                out.print(nfname+" "+nlname);%></td>
            </tr>
            <tr>
                <td scope='row'>Email</td>
                <td scope='row'><%out.print(email);%></td>
            </tr>
            <tr>
                <td scope='row'>DOB</td>
                <td scope='row'><%out.print(dob);%></td>
            </tr>
            <tr>
                <td scope='row'>Favorite Food</td>
                <td scope='row'><%out.print(favfood);%></td>
            </tr>
            <tr>
                <td scope='row'>Lucky Number</td>
                <td scope='row'><%out.print(lno);%></td>
            </tr>
            <tr>
                <td scope='row'>Gender</td>
                <td scope='row'><%out.print(gender);%></td>
            </tr>
            <tr>
                <td scope='row'>Select</td>
                <td scope='row'>You have selected <%out.print(select);%></td>
            </tr>
            <tr>
                <td scope='row'>Remark</td>
                <td scope='row'><%out.print(remark);%></td>
            </tr>
        </tbody>
    </table>
    <button class='btn btn-primary m-t-3 ' id='print' onclick='window.print()'>Print</button>
    
  </div>
 
    
</body>
</html>