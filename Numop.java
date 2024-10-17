package innerclasses;

import java.util.Scanner;

public class Numop
{
    int a, n, k, sum = 0, multi = 1, rnu = 0;
    int[] marks;

    void add() {

        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no for add");
        int n=sc.nextInt();
        while (n!=0)
        {
            k=n%10;
            n=n/10;
            sum=sum+k;
        }
        System.out.println("sum is"+sum);
    }

    void multi() {

        int multi=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no for multi");
        int n=sc.nextInt();
        while (n!=0)
        {
            k=n%10;
            n=n/10;
            multi=multi*k;
        }
        System.out.println(" multiple is"+ multi);
    }

    void rev() {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter no for rev");
        int n=sc.nextInt();

        int r_num=0;
        while(n>0)
        {
            r_num=(r_num*10)+(n %10);
            n=n/10;
        }
        System.out.println(r_num);
    }

    void p()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no p ");
        int n=sc.nextInt();
        int temp=n;
        int rev=0,digit;
        while(temp>0)
        {
            digit=temp % 10;
            rev =rev * 10+digit;
            temp=temp/10;

        }
        if(rev == n)
        {
            System.out.println("no is  palindrome");
        }
        else
        {
            System.out.println(" no is not palindrome");
        }
    }
    static class Arrayop
    {
        int f=0;
        int[] a={1,2,3,4,5};
        public void linear()
        {
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
        public void as()
        {
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
        public void ds()
        {
            int[] d=a;
            for (int i = 0; i < d.length; i++) {

                for (int j = i + 1; j < d.length; j++)
                {
                    if (d[i] < d[j])
                    {
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
        public void min()
        {
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
        public void max()
        {
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
    }

    public static void main(String[] args) {
         Numop  e1 = new Numop();

         e1.p();
        e1.rev();
        e1.multi();
        e1.add();
        Arrayop s1=new Arrayop();
        s1.as();
        s1.ds();
        s1.linear( );
        s1.max();
        s1.min();

    }

}
