package Simple;

import java.util.Scanner;
public class StringFormatter
{

    public static void main(String[] args)
    {
        //StringBuilder a=new StringBuilder("hello");
        // a.reverse();
        //System.out.println(a);
        Scanner obj=new Scanner(System.in);
        System.out.print("string is ");
        String a=obj.next();

        System.out.println(" string is "+ a);

            char[] b= a.toCharArray();
            for(int i=b.length-1;i>=0;i--)
            {
                System.out.print(b[i]);
            }


    }
}
