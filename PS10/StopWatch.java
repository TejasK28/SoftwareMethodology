package PS10;

public class StopWatch implements Runnable
{
    

    int min;
    int sec;

    @Override 
    public void run() {
        try {
            while (!Thread.interrupted()) {
                display();
                wait(5);
            }
        } catch (InterruptedException e) {
            System.out.println("Stopwatch stopped.");
        }
    }

    public void display()
    {
        System.out.println("" + min + " : " + sec);
    }


    public void wait(int s) throws InterruptedException
    {
        sec += 5;
        if(sec >= 60)
        {
            sec = sec %60;
            min++;
        }

            Thread.sleep(s * 1000);
    }


}
