package PSET10;

public class Main
{

    public static void main(String[] args) throws InterruptedException {

        /*
        This call is meant to call a thread via the runnable interface

        This method will start a new thread that starts a stopwatch based on the specifications
         */
        Question1 q1 = new Question1();
        Thread thread = new Thread(q1);
        thread.start();


        /*
        In this first thread, we will print out the time every 5 seconds via a method call to the second thread class
         */
        Thread.sleep(1000);
        while(true)
        {
            Thread.sleep(5000);

            q1.printTime();
        }

    }
}
