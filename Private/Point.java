package Private;

public class Point
{
    /*
     * int x and int y are private
     * 
     * They can be inherited but they will be hidden!
     */
    private int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }
}