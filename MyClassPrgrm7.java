package assignment;

public class MyClassPrgrm7
{
    public int returnNumber() {
        int c = 0;
        float a = 7.8f;
        float b = 4.4f;
        c = (int) (a + b); // Cast the sum of a and b to int
        return c;
    }

    public static void main(String[] args)
    {
        MyClassPrgrm7 myClass = new MyClassPrgrm7();
        int result = myClass.returnNumber();
        System.out.println("The value of C is: " + result);
    }

}
