package threds;

public class Second extends Thread
{
    @Override
    public void run() {
        super.run();
        for(int i=10;i>=1;i++){

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(" ex"+i);

        }
    }
}
