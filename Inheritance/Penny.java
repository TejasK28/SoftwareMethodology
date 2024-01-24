package Inheritance;

public class Penny 
extends Coin
{

    public Penny(int value) 
    {
        super(value);
    }
    
    public int getValue()
    {
        return this.value;
    }
    
}
