package AccessTest;

public class B extends A
{
   
    public void method2()
    {
        System.out.println("subclass m2");
    }

    public static void main(String[] args)
    {
       A a = new B();
       a.method1();
    }
    
}
