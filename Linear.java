package Array;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};


           // int[] b=a;
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
            System.out.println();

    }
}
