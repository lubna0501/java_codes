package pattern;

import java.util.Scanner;
public class Sum
{
    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
//        System.out.print(" enter the value of a");
//        int a=obj.nextInt();
//        int sum=0;
//        int b=1;
//
//        while (b<=a)
//        {
//            b++;
//            sum=sum+b;
//
//
//        }
//        System.out.println(" sum is"+ sum);
        int x = 1;
        int sum=0;

        while (x<=5)
        {
            x++;
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
