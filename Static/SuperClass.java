package Static;

public class SuperClass
{
    static int x = 10;

    static int y = 5;


    public static int getX()
    {
        return x;
    }
    /*
     * A nonstatic mathod can return a static field
     */
    public int getY()
    {
        return y;
    }
}
