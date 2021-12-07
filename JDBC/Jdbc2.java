import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc2
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/result?serverTimezone=UTC","root","");
            CallableStatement statement= con.prepareCall("{call getcount_of_student(?)}");
            statement.registerOutParameter(1,java.sql.Types.NUMERIC);
            statement.execute();
            int total=statement.getInt(1);
            System.out.println("Total number of students : "+" "+total);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
