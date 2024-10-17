package Constructor;

public class Cal
{
    int a,b;
    public Cal(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int Add()
        {
            int sum=a+b;
            System.out.println(" sum is "+ sum);
           return sum;
        }
    public int sub( )
    {
        int sub=a-b;
        System.out.println(" sub is "+ sub);
        return sub;
    }
    public int multi( )
    {
        int multi=a*b;
        System.out.println(" multi is "+ multi);
        return multi;
    }
    public int div( )
    {
        int div=a/b;
        System.out.println(" divide is "+ div);
        return div;
    }
    public int modules( )
    {
        int mod=a%b;
        System.out.println(" modules is "+ mod);
        return mod;
    }

    public static void main(String[] args)
    {
        int a =12;
        int b = 2;
        Cal a1= new Cal(a,b);
        a1.Add();
        a1.sub();
        a1.multi();
        a1.div();
        a1.modules();

    }
}
