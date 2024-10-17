package excep;

public class indexoutofbound
{
    public static void main(String[] args)
    {
        int[] a =  {1,2,5,4,3};
        System.out.println ( a[7]);
        try
        {
            System.out.println ( a[7]);
        }
        catch( IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        System.out.println(" index out of bound exception occur");
    }
}
