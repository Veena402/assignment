package assignment;

public class MyClass2
{
    static class ClassB
    {
        int integerValue;
        public ClassB(int value)
        {
            this.integerValue = value;
        }
        public void printIntegerValue()
        {
            System.out.println("Integer value in ClassB: " + integerValue);
        }
    }

    static class ClassA
    {
        int integerValue;
        public ClassA(int value)
        {
            this.integerValue = value;
        }
        public void printClassBIntegerValue(ClassB b)
        {
            b.printIntegerValue();
        }
        public void resetClassBIntegerValue(ClassB b, int newValue)
        {
            b = new ClassB(newValue);
        }
    }

    public static void main(String[] args) {
        ClassB b = new ClassB(10);
        ClassA a = new ClassA(5);
        a.printClassBIntegerValue(b);
        a.resetClassBIntegerValue(b, 20);
        a.printClassBIntegerValue(b);
    }
}
