package excep;

public class arithmaticexception
{
    public static void main(String[] args)
    {
        try {
            int a = 30, b = 0;
            int c = a/b;
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
           // System.out.println ("Can't divide a number by 0");
        }
        System.out.println(" arithmetic exception occur");
    }
}
