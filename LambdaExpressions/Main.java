import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
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

        /*
            I'm going to do some tests with the consumer functional interface

            We can see that the consumer functional interface is implemented
         */ 

         System.out.println("[CONSUMER]");

         Consumer<Integer> consumer = (i) -> System.out.println(i);

         for(int i : list)
            consumer.accept(i);


        /*
         * We can also use method references
         * 
         * The idea behind this is that the consumer we created already exists as System.out.println()
         */

         System.out.println("[METHOD REFERENCE]");
         list.forEach(System.out::println);

         /*
          * Now I'm going to try out the Function interface
          */
          System.out.println("[FUNCTION]");
          List<String> strList =  Arrays.asList("Hellow", "world", "!");
          Function<String, Integer> getLength = (String s) -> s.length();

          for(String s : strList)
            System.out.println(getLength.apply(s));

         


        











    }
}
