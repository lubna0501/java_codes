package Array;

import java.util.Scanner;

public class Arrayop
{
    int[] a={1,2,3,4,5};

    public void linear(){
        int[] b=a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your no for search");
        int num = obj.nextInt();
        boolean isfound=false;
        for(int i=0;i<b.length;i++)
        {
            if(num==b[i])
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
    public void as(){

        int[] c = a;

        for (int i = 0; i < c.length; i++) {

            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                }

            }

        }
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j] + " ");
        }
        System.out.println();
    }
    public void ds(){
       // int[] a = {1, 3, 5, 6, 4, 2};
        int[] d=a;
        for (int i = 0; i < d.length; i++) {

            for (int j = i + 1; j < d.length; j++) {
                if (d[i] < d[j]) {
                    int temp = d[j];
                    d[j] = d[i];
                    d[i] = temp;
                }

            }

        }
        for (int j = 0; j < d.length; j++) {
            System.out.print(d[j] + " ");
        }
        System.out.println( );
    }
    public void min(){
        //int[] a={1,2,3,5,9};

        int[] e=a;
        int min=e[0];

        for( int i=0;i>a.length;i++)
        {
            if(e[i]<min)
            {
                min=e[i];
            }
        }
        System.out.print("min is "+ min);
        System.out.println();
    }
    public void max(){
        //int[] a={1,2,3,5,9};
        int[] f=a;
        int max = f[0];


        for( int i=0;i<a.length;i++)
        {
            if(f[i]>max)
            {
                max=f[i];
            }
        }
        System.out.println("max is "+ max);
    }


    public static void main(String[] args) {

        Arrayop aone=new Arrayop();

        aone.linear();
        aone.as();
        aone.ds();
        aone.min();
        aone.max();
    }
}
