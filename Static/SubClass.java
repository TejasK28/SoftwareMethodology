package Static;

public class SubClass
extends SuperClass
{
    /*
     * with the `extends` keyword
     * the idea with static variables is that they are inherited 
     * but then hidden if they are to be overridden like you see here
     */
    static int x = 20;

    /*
     * The fields that override the inherited static field doesn't have
     * to be static but the that's not the case for methods
     */
    int y = 6;

    
    public static int  getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    
}