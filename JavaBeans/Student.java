import java.io.Serializable;

class StudentBean implements Serializable
{
    /**
     *
     */
    //private static final long serialVersionUID = 872244386904018391L;
    /**
     *
     */
    private String name;
    private String rollno;
    private String department;
    private int id;
    public StudentBean(){}
    public StudentBean(String name , String rollno, String department, int id){
        this.setName(name);
        this.setDepartment(department);
        this.setRollno(rollno);
        this.setId(id);
    }
    
    public String getName()
    {
        return this.name;
    }
    public String getRollno()
    {
        return this.rollno;
    }
    public String getDepartment()
    {
	    return this.department;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public void setRollno(String rollno)
    {
        this.rollno=rollno;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}
public class Student
{
    public static void main (String args[])
    {
        StudentBean s=new StudentBean("Lalit", "Z-1229", "CS(H)", 5);
        System.out.println("Name     : "+s.getName());
        System.out.println("Rollno   : "+s.getRollno());
        System.out.println("department   : "+s.getDepartment());
        System.out.println("id : "+s.getId());
    }
}