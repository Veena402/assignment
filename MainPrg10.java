package assignment;

public class MainPrg10
{
    public static void main(String[] args)
    {
        EmployeePrg10 emp = new EmployeePrg10();
        emp.setName("John Doe");
        emp.setId(101);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
    }
}
