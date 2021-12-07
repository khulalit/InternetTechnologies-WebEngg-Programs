import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;
class Jdbc1{
    public static void main(String[] args)
    {
    ResultSet rs; // resultset interface reference represents the result set of a database query
    try
    {
        //variables for the divisions
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        // connecting to database
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/result?serverTimezone=UTC","root","");
        Statement stmt = con.createStatement();
        do{
            System.out.println("---------OPTIONS---------");
            System.out.println("1.Find total students");
            System.out.println("2.Each subject avergae marks");
            System.out.println("3.Student with highest marks");
            System.out.println("4.No of students getting first second and third divisions");
            System.out.println("5.Subject wise topper");
            System.out.println("6.Average marks in class");
            System.out.println("7.Student with second highest marks");

			int ch;
            String sub;
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner br = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            ch=sc.nextInt();

			switch(ch)
            {
                case 1: rs= stmt.executeQuery("select count(*) total from students");
                        while(rs.next()){
                            int tota =rs.getInt("total");
                            System.out.println(tota);
                        };
                        
                        break;

				case 2: System.out.println("Enter the subject");
                        sub=sc.next();
                        String sql=" select avg("+sub+") as 'avg' from submarks;";
                        rs=stmt.executeQuery(sql);
                        while(rs.next()){
                            int s=rs.getInt("avg");
                            System.out.println(s);
                        }
                        
						break;

               case 3: System.out.println("");
                        rs = stmt.executeQuery("select name from (select english+maths+socialscience as total, rollno from submarks) as t, students where t.total in (select max(english+maths+socialscience) from submarks ) and students.rollno = t.rollno;");
                        rs.next();
                        String n=rs.getString("name");
                        System.out.println("The student with highest marks is "+" "+n);
						break;

               case 4: rs=stmt.executeQuery("select name, aggrigate as 'div' from (select (english+maths+socialscience)/3 as 'aggrigate', rollno from submarks) as total, students where total.rollno = students.rollno;");
	                    while(rs.next())
    	                {
        	                if(rs.getInt("div")>=80)
            	            {
                	            c1++;
                    	    }
							else if(rs.getInt("div")<80&&rs.getInt("div")>=60)
							{
								c2++;
							}
							else if(rs.getInt("div")<60&&rs.getInt("div")>33)
							{
								c3++;
							}
							else
							{
								c4++;
							}
						}
                        System.out.println("Students in division one "+c1);
                        System.out.println("Students in division two "+c2);
                        System.out.println("Students in division three "+c3);
                        // System.out.println("Students in division four "+c4);
						break;

				case 5: rs=stmt.executeQuery("select name from (select english as total, rollno from submarks) as t, students where t.total in (select max(english) from submarks ) and students.rollno = t.rollno;");

                        while(rs.next()){
                        System.out.println("The topper for english is "+rs.getString("name"));
                        }
                        //break;

                rs=stmt.executeQuery("select name from (select maths as total, rollno from submarks) as t, students where t.total in (select max(maths) from submarks ) and students.rollno = t.rollno;");

                        while(rs.next()){
                        System.out.println("The topper for maths is "+rs.getString("name"));
                        }//break;
                rs=stmt.executeQuery("select name from (select socialscience as total, rollno from submarks) as t, students where t.total in (select max(socialscience) from submarks ) and students.rollno = t.rollno;");

                        while(rs.next()){
                        System.out.println("The topper for socialscience is "+rs.getString("name"));
                        
                        }break;

				case 6: rs=stmt.executeQuery("select avg(english+maths+socialscience) as 'avg' from submarks;");
                       
                        while(rs.next()){
                        System.out.println("Average marks is  "+rs.getString("avg"));
                        
                        }break;

                case 7: rs=stmt.executeQuery("select name from ( select english+maths+socialscience as 'total' , rollno from submarks group by total desc limit 1,1) as t , students where students.rollno = t.rollno;");
                        while(rs.next()){
                        System.out.println("Second topeer is "+rs.getString("name"));
                       
                        } break;
			}
	
			System.out.println("Do u want to continue y\n");
            String s= br.nextLine();
            if(s.startsWith("n"))
            {
                System.exit(0);
            }
        } while(true);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}


