package Simple;

import java.util.Scanner;

public class Area
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter your radius");
        int r=obj.nextInt();
        System.out.println(" area of circle is  "+ 3.14*r*r);
        System.out.print("enter your width");
        int w=obj.nextInt();
        System.out.print("enter your length");
        int l=obj.nextInt();
        System.out.println(" area of rectangle is  "+  w*l);
        System.out.print("enter your side for sq");
        int a=obj.nextInt();
        System.out.println(" area of square is  "+ a*a);
    }
}