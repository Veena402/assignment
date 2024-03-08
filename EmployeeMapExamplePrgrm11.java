package assignment;
import java.util.HashMap;
import java.util.Map;

public class EmployeeMapExamplePrgrm11
{
    public static void main(String[] args) {
        //HashMap to store employee information
        Map<Integer, String> employeeMap = createEmployeeMap();

        // Printing the employee information
        printEmployeeInformation(employeeMap);
    }

    public static Map<Integer, String> createEmployeeMap() {
        // HashMap to store employee information
        Map<Integer, String> employeeMap = new HashMap<>();

        // Adding employee information
        employeeMap.put(101, "Jadeja");
        employeeMap.put(102, "Dhoni");
        return employeeMap;
    }

    public static void printEmployeeInformation(Map<Integer, String> employeeMap)
    {
        System.out.println("Employee Information:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet())
        {
            System.out.println("EmpNo: " + entry.getKey() + ", EmpName: " + entry.getValue());
        }
    }
}
