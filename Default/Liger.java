package Default;

/*
 * I can't extend both Tiger and Lion in any class
 * I can only extends once per class
 */
public class Liger implements TigerDefault
{
    /*
     * I created a TigerDefault interface to see the 
     * effects of default in a interface setting
     * as follows
     */

    /*
     * Can you make an implmented interface method
     * static?
     * 
     * my guess is no.
     * 
     * Which is the right answer.
     * 
     * the below method is an example of that
     */

    //  public static void roar()
    //  {
    //     System.out.println("ROAR");
    //  }
    
    /*
     * You can't reduce the visibility of an interface
     * method that is being implemented
     */
    public void roar()
    {
        System.out.println("roar from TigerDefault");
    }
}
