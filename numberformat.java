package excep;

public class numberformat
{
    public static void main(String[] args)
    {
        try {

            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
            System.out.println("Number format exception");
        }
    }
}
