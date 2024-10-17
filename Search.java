package pattern;

import java.util.Scanner;
public class Search
{
    public static void main(String[] args)
    {
        int[] a={1,2,2,3,4};
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your no for search");
        int num = obj.nextInt();
        boolean isfound=false;
        for(int i=0;i<a.length;i++)
        {
            if(num==a[i])
            {
                System.out.print("element found"+i+"position");
                 isfound = true;
                break;
            }

        }
        if(isfound==false)
        {
            System.out.print("element not found");
        }
    }
}
