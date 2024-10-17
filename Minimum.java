package pattern;

public class Minimum
{
    public static void main(String[] args)
    {
        int a= 15;
        int b =12;
        int c= 1;
        if((a<b) && (a<c))
        {
            System.out.println("a is minimum ");
        }
        else if((b<a) && (b<c))
        {
            System.out.println("b is minimum");
        }
        else if ((c<a)&&(c<b))
        {
            System.out.println("c is minimum");
        }
    }
}
