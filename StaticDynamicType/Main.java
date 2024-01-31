package StaticDynamicType;

public class Main {

    public static void main(String[] args) {
        /*
        * I'm going to make the static type A, and the dyanmic type B
        * 
        * I want to test is I can call a method present in B but not in A
        */

        A a = new B();
        /*
         * So this makes sence because this shouldn't work, I don't know why there was an example
         * in problem set 1 where this was possible
         */
        //System.out.println(a.getSomething());


        /*
         * The following is a test to see how a poblem on the pset would work
         */

         G ag = new H();
         ag.g = 15;

         G bg = new G();
         bg.g= 15;

         if(ag.equals(bg))
            System.out.println("10");
         else
            System.out.println("20");


    }
    
}
