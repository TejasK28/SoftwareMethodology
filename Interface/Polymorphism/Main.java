package Interface.Polymorphism;

public class Main 
{
    public static void main(String[] args)
    {
        /*
         * Polymorphism with interfaces
         * allow us to declare the static type
         * as a interface and set it equal to 
         * the dynamic type of the actual object
         * 
         * but why?
         * so now we can put all these objects into
         * a common list under the interface name
         */
        Equine horse = new Horse();
        Equine donkey = new Donkey();

        Equine [] animals = new Equine[2];
        animals[0] = horse;
        animals[1] = donkey;

        for(Equine animal : animals)
            animal.trot();
    }
}
