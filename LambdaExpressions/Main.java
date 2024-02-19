import java.util.Arrays;
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

        IntPicker testPick = new IntPicker() {
            public void pick(int i)
            {
                System.out.println(i);
            }
        };


        /*
         * I'm making a temporary list to store a bunch of random values
         */
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,10); 


        /*
         * What I'm doing here is skipping by using stream and for each
         * to show how we can take in an input and print out the integer
         * 
         * hence an example of a lambda expressions being an implementation
         * of a functional interface
         */
        list.stream().forEach(i -> System.out.println(i));








    }
}
