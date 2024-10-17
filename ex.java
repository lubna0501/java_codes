package threds;

public class ex extends Thread
{
    @Override
    public void run() {
        super.run();
        for(int i=1;i<=10;i++){

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

    public static void main(String[] args) {
        ex e1=new ex();
        Second s1=new Second();
        e1.start();
        s1.start();
        Third e3=new Third();
        Thread t2=new Thread(e3);
        t2.start();
    }

}

