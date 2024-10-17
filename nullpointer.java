package excep;

public class nullpointer
{
    public static void main(String[] args)
    {
        try
        {
            String a =  null;
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
        System.out.println("NullPointerException..");
    }
}
