package AbstractClasses;

public class Main 
{

    public static void main(String[] args) {

        /*
         * This is to test if I can call a static method from an abstract class
         */
        
        System.out.println(Vehicle.getYear());


        /*
         * This confirmed we can make an array of
         * abstract classes
         * 
         * following that we can store all 
         * related classes in the indexes
         */
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Volvo();
        vehicles[1] = new BMW();

        for(Vehicle v : vehicles)
            v.vroom();


    }
    
}
