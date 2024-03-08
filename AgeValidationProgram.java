package assignment;

public class AgeValidationProgram {
    public static void main(String[] args) {
        int age = 20; // Change age value to test different scenarios

        Validator validator = new Validator();
        try {
            validator.validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


