package PSET10;

public class Question1 implements Runnable
{

    int min = 0;
    int sec = 0;
    
    @Override
    public void run()
    {

        while(true)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

            sec++;

            if(sec == 60)
            {
                min++;
                sec = 0;
            }
            else if(min == 15)
            {
                min = 0;
                sec = 0;
            }

        }

    }

    public void printTime()
    {
        System.out.println("Time: " + min + ":" + sec);
    }



}
