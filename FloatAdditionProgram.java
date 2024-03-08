package assignment;

public class FloatAdditionProgram
{
    public static void main(String[] args)
    {
        FloatAdditionCalculator calculator = new FloatAdditionCalculator();
        float result = calculator.addFloatNumbers(8.6f, 9.7f);
        System.out.println("Sum of 8.6 and 9.7 is: " + result);
    }
}

class FloatAdditionCalculator
{
    public float addFloatNumbers(float num1, float num2)
    {
        return num1 + num2;
    }
}
