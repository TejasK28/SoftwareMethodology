import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;

public class Main 
{
    public static void main(String [] args)
    {

        /*
         * I saved the intPicker Interface as a IntPicker static type
         * with the dynamic type as an implementation of the abstract method
         * 
         * notice house the there are curly brackets at the end
         * 
         * - there are no constructors
         * - can't create a class from it
         */

        IntPicker evenPicker = new IntPicker() {
            public void pick(int i)
            {
                if(i % 2 == 0)
                    System.out.println(i);
            }
        };


        /*
         * I'm making a temporary list to store a bunch of random values
         */
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,10); 


        /*
         * I'm going to test the square interface 
         */

        Square getAreaLambda = (int s) -> {return s*s;};

        for(int i : list)
        {
            System.out.println(getAreaLambda.getArea(i));
        }









    }
}
