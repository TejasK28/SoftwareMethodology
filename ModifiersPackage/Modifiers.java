package ModifiersPackage;
import ModifiersPackage.abcpackage.*;

public class Modifiers 
{
    public static void main(String[] args) {
        
        A a = new A();
        /*
         * You can't access a protected field via an instance
         */
        //System.out.println(a.protectedInt);
    }

}
