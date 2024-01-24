package Private;

public class ColoredPoint extends Point 
{

    public ColoredPoint(int x, int y)
    {
        super(x,y);
    }

    /*
     * This method fails to compile because 
     * the int x is inherited but not visible to 
     * ColoredPoint
     * 
     * This shows how ColoredPoint has x but cant access it
     * so we can't call this method directly
     * 
     * This method is also overridden
     */

    // public int getX()
    // {
    //     return x;
    // }
    
}
