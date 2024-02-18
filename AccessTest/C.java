package AccessTest;

public class C extends A
{
    public void print()
    {
        x = "World";
        System.out.println(x);
    }
    public void printx()
    {
        System.out.println(x);
    }
    public static void main(String[] args)
    {
       B b = new B();
       b.print();
    }
    
}
