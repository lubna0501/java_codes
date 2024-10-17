package Simple;

public class Maximum
{
    public static void main(String[] args)
    {
        int a = 120;
        int b =90;
        int c = 10;
        int d=56;
        if ((a>b) && (a>c) && (a>d))
        {
            System.out.println("a is maximum");
        }
        else if ((b>a)&&(b>c)&&(b>d))
        {
            System.out.println("b is maximum");
        }
        else if ((c>a)&&(c>b)&&(c>d))
        {
            System.out.println("c is maximum");
        }
        else if ((d>a)&&(d>b)&&(d>c))
        {
            System.out.println(" d is maximum");
        }
    }
}
