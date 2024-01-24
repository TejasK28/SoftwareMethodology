package Private;

public class Supercl 
{
    /*
     * This static int is meant 
     * to be hidden by the static int in the subclass
     */
    static int x = 2;

    /*
     * This static int is mean to
     * be hiddden by an instance int of the subclass
     */
    static int y = 4;

    private void mpriv()
    {
        System.out.println("Supercl");
    }

    /*
     * We know that now public methods
     * can call private methods
     */
    public void mpub()
    {
        mpriv();
    }

    public static void main(String[] args)
    {
        new Supercl().mpub();
        /*
         * This object can see the mpriv private method because private method is in the fame file as the object
         */
        new Supercl().mpriv();
    }
    
}
