import java.lang.Math;

public class PMF 
{
    public static int myBalance = 100;
    public static int dealerBalance = 10;
    

    public static void main(String[] args)
    {

        
        for(int i = 0; i < 100; i++)
            play();
        

        getStats();
   
    }

    public static void play()
    {

        myBalance -= 3;
        dealerBalance += 3;

        String [] flips = new String[3];
        flips[0] = flip();
        flips[1] = flip();
        flips[2] = flip();

        String heads = "HEADS";
        int headCtr = 0;
        for(String flip : flips)
        {
            if(flip.equals(heads))
                ++headCtr;
        }

        if(headCtr == 0)
        {
            myBalance += 1;
            dealerBalance -= 1;
        }
        if(headCtr == 1)
        {
            myBalance += 2;
            dealerBalance -= 2;

        }
        if(headCtr == 2)
        {
            myBalance += 3;
            dealerBalance -= 3;

        }
        if(headCtr == 3)
        {
            myBalance += 4;
            dealerBalance -= 4;
        }



    }

    public static void getStats()
    {
        System.out.println("MyBalance: " + myBalance + "\nDealerBalance: " + dealerBalance);
    }

    public static String flip()
    {
        return (Math.random() >= 0.5) ? "HEADS" : "TAILS";
    }
    
}