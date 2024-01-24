package Constructors;

public class NonEmptyCoin 
{

    int value;
    /*
     * a test default constructor to try out `this()`
     */
    public NonEmptyCoin()
    {
        /*
         * remember this() will look for another constructor 
         * that matches the parameters
         * 
         * this `this()` will look for the parameterized constructor below
         */
        this(0);
    }

    public NonEmptyCoin(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
    
}
