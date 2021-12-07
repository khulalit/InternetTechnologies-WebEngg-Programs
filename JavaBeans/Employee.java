import java.io.Serializable;

class EmployeeBean implements Serializable
{
    /**
     *
     */
    // private static final long serialVersionUID = 1L;
    /**
     *
     */
    private String name;
    private String department;
    private int id;
    public EmployeeBean(){}
    public EmployeeBean(String name , String department, int id){
        this.setName(name);
        this.setDepartment(department);
        this.setId(id);
    }
    
    public String getName()
    {
        return this.name;
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
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}
public class Employee {
    public static void main (String args[])
    {
        EmployeeBean e=new EmployeeBean("John","IT", 5879847);
        System.out.println("Name       : "+e.getName());
        System.out.println("ID         : "+e.getId());
        System.out.println("Department : "+e.getDepartment());
    }
}
