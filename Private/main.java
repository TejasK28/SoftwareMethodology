package Private;

public class main 
{

    public static void main(String [] args)
    {
        //We are creating the ColorPoint Object
        ColoredPoint cp = new ColoredPoint(5, 10);

        /*
         * This call would compile 
         * because we never overrode the getX() method
         * and the getX() method is inherited from Point
         */
        System.out.println(cp.getX());


        /*
         * This is the syntax to call a static field
         * Syntax: ClassName.fieldName
         */
        System.out.println(Supercl.x);

        Subcl sub = new Subcl();

        System.out.println(sub.x);

        System.out.println(sub.y);




        System.out.println("End of Program");

    }
}