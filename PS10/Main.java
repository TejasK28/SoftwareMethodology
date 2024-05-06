package PS10;

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        StopWatch sw = new StopWatch();
        Thread swThread = new Thread(sw);

        System.out.println("Starting stopwatch thread...");

        swThread.start();

        String ans = "";

        while(true)
        {
            System.out.println("quit?");
            ans = scan.nextLine();

            if(ans.startsWith("y"))
            {
                swThread.interrupt();
                System.out.println("Stopwatch thread interrupted");
                System.out.println("Done!");
                break;
            }
            
        }   
        
    }
    
}
