package assignment;

public class OverloadedConstructorExample
{
    private int value;
    public OverloadedConstructorExample()
    {
        this.value = 0;
    }
    public OverloadedConstructorExample(int value) {
        this.value = value;
    }
    public OverloadedConstructorExample(String valueString) {
        try {
            this.value = Integer.parseInt(valueString);
        } catch (NumberFormatException e) {
            System.out.println("Error: Could not parse integer from string.");
            this.value = 0;
        }
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        OverloadedConstructorExample obj1 = new OverloadedConstructorExample();
        obj1.printValue();

        OverloadedConstructorExample obj2 = new OverloadedConstructorExample(10);
        obj2.printValue();

        OverloadedConstructorExample obj3 = new OverloadedConstructorExample("20");
        obj3.printValue();
    }

}

