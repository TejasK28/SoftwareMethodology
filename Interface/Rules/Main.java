package Interface.Rules;

public class Main 
{
    public static void main(String[] args)
    {

        Rabbit r = new Rabbit();
        Hawk h = new Hawk();

        r.flee();
        
        h.hunt();
        
    }
}
