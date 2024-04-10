package MultiThreading;

public class MT
{
    public static void main(String[] args)
    {


        //new MTThing().start(); // we use start not thread
        //new MTThing().start(); // we use start not thread

        MTThingRunnable MTThingRunnable = new MTThingRunnable();
        Thread newThread = new Thread(MTThingRunnable);

        newThread.start();




    }


}
