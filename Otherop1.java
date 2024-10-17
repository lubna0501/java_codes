package Constructor;

public class Otherop1
{
    int min,max,a,b; int table;
    public Otherop1(int min,int max)
    {
        this.min=min;
        this.max=max;
    }

    public Otherop1() {
    }

    public int table(int a,int b){
        for(int i=a;i<=b;++i)
        {
            for(int j =1;j<=10;j++)
            {
                System.out.println(" "+i+"*"+j+"="+(i*j));
            }
            System.out.println( );
        }
        return table;
    }

    public static void main(String[] args)
    {
        Otherop1 a1 = new Otherop1(2,10);
        a1.table(2,10);

    }


}
