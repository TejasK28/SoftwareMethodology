package AbstractClasses;

public abstract class Vehicle 
{
    /*
     * This is an abstract class.
     * 
     * We need the @abstract keyword which the compiler cares about only.
     * 
     * We can have implemented methods + abstract methods in this.
     * 
     * To utilize this abstract class, we use the @extends keyword.
     *
     */

     static int year;
     int plate;

     /*
      * We can have static methods in abstract classes!
         This is also called the regular way.
      */
     public static int getYear()
     {
        return year;
     }

     public abstract void vroom();
    
}
