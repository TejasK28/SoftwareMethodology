package Constructors;

public class Main
{
    public static void main(String[] args)
    {
        /*
         * the EmptyCoin class is just a definition
         * so this creation of an objec will work!
         * this is because there is no programmer-defined constructor,
         * so the compiler will throw a default constructor
         */
        EmptyCoin coin = new EmptyCoin();

        /*
         * this is a NonEmptyCoin class with a programmer defined constructor,
         * so the compiler will not throw a default constructor
         * 
         * and I also used `this()` in this class
         */
        NonEmptyCoin coin2 = new NonEmptyCoin();

        
        
        System.out.println("Reached the end of the program!");
    }
}

