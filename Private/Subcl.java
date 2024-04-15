package Private;

public class Subcl extends Supercl
{
    /*
     * What's happening here is that
     * Supercl has a static int with the value of 2
     * but when we inherit that field, we are hiding it with this value
     */
    static int x = 3;
    /*
     * This still hides the superclass static int
     */
    int y = 5;


    int a = 10;

    







}
