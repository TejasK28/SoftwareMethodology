package Static;

public class Main
{

    public static void main(String [] args)
    {
            SuperClass c = new SuperClass();

            System.out.println(SuperClass.x);
            /*
             * We will get 5 because static types are bound
             * to the static type of the class
             * 
             * meaning we don't think of this as dyanmic
             * binding
             */
            System.out.println(c.getY());

    }
}