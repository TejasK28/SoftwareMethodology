package MultiThreading;


/**
 * Creating a thread class
 */
public class MTThing extends Thread
{
    @Override
    public void run()
    {

        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
            }

        }


    }
}
