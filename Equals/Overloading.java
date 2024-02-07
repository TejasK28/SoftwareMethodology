package Equals;

public class Overloading 
{
    public static void main(String[] args)
    {
        /*
         * Notice here that if I pass in 0, we
         * will run the non-overriding method
         * 
         * and vice-versa
         */
        float f = 43.4f;
        new Overloading().Overload(f);


    }

    /*
     * I'm going to test different cases regarding 
     * Method Overriding
     * 
     * Method Overriding occurs when we have
     * the same name + different parameters
     * 
     * We don't care about the return type!
     */
    public void Overload(int x)
    {
        System.out.println("Non-overriding");
    }
    /*
     * I created the same method twice to show
     * how two methods with the same signature will fail
     * 
     * Notice the different return type
     */
    //  public int Override(int x)
    //  {
    //      System.out.println("Non-overriding");
    //         return 0;
    //  }

    /*
     * This should override the original method
     * Compiler checks the signature only
     */
    public float Overload(float y)
    {
        System.out.println("overriding");
        return y;
    }


}
