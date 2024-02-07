package Equals;

public class Equals
{
    public static void main(String[] args) 
    {
        
    }

    /*
     * The intention here is to override the equals method
     * from the Object class
     */
    public boolean equals(Object o)
    {
        if(o == null || !(o instanceof Equals))
            return false;

        System.out.println("Overrided Equals Method");

        return true;

    }
}