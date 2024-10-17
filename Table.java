package pattern;

import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter your value");
        int a=obj.nextInt();
        System.out.print("enter your value");
        int b=obj.nextInt();
        for(int i=a;i<=b;++i)
            {
                for(int j =1;j<=10;j++)
                {
                    System.out.println(" "+i+"*"+j+"="+(i*j));
                }
                System.out.println( );
            }

    }
}
