package AccessTest;

public class B extends A
{
    public void print()
    {
        x = "Helo";
        System.out.println(x);
    }
    public void printx()
    {
        System.out.println(x);
    }

    public void change()
    {
        super.x = "!!!";
    }

    public static void main(String[] args)
    {
       B b = new B();
       C c = new C();

       b.print();
       c.print();
       b.printx();
       b.change();
       b.printx();
       c.printx();
    }
    
}
