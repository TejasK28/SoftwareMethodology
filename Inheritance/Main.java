package Inheritance;

public class Main 
{
    
    public static void main(String[] args)
    {
        /*
         * This is an example of inheritance since the Penny class extends the Coin class
         * so the `int value` and `getValue()` methods are known
         */
        Coin coin = new Coin(25);
        Penny penny = new Penny(1);

        System.out.println(penny.getValue());

        /*
         * An empty superclass and an empty subclass instance would work
         * as expected
         * 
         * the compiler throws a default construcotr in the superclass and the implicit
         * super call is made in the subclass
         */
        EmptySuperClass s = new EmptySubClass();


        /*
         * This nuance is reuarding how `super()` can only be called implciitly if
         * there is a default constructor in the super class
         * 
         * since SuperClass has a parameterized constructor without any default constructor,
         * we get an error so we need to call `super()` manually
         */
        SuperClass s2 = new SubClass(0);


        /*
         * Here I am testing out how the compiler will call getValue()
         * In theory, the compiler will fail because getValue() is only in Penny and 
         * not in Coin, and the compiler has to start at Coin because the compiler
         * will always look at the static type first
         */
        Coin c = new Penny(1);

        /*
         * I greyed out this line because the theory is right
         * the method must be present in the superclass and subclass
         * or at the very least be present in the superclass
         * or else we get an error
         */
        //System.out.println(c.getValue());
        

        
        
        System.out.println("END");

    }
}
