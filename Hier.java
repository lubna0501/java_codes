package Constructor;

import java.util.Scanner;

public class Hier extends Otherop1
{
    int a,n,k,b;

    public Hier(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        while (n!=0)
        {
            k=n%10;
            n=n/10;
            sum=sum+k;
        }
        System.out.println("sum is"+sum);
    }
    public void multi()
    {
        int multi=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        while (n!=0)
        {
            k=n%10;
            n=n/10;
            multi=multi*+k;
        }
        System.out.println(" multiple is"+ multi);
    }
    public void rev()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();

        int r_num=0;
        while(n>0)
        {
            r_num=(r_num*10)+(n %10);
            n=n/10;
        }
        System.out.println(r_num);
    }
    public void p()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no p");
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



    public static class Mathsop  extends Otherop1
    {
        ;String name; int grade;  int total;
        int a; double max;
        public int[] marks;
        public Mathsop(int a)
        {
            this.a=a;
        }

        public int square(int i)
        {
            int sq =a*a;

            return sq;
        }
        public int  cube(int i)
        {
            int cube =(a*a*a);

            return cube;
        }
        public  double max (double a,double b,double c)
        {
            if ((a>b) && (a>c))
            {
                System.out.println("a is maximum");
                return a;
            }
            else if ((b>a)&&(b>c))
            {
                System.out.println("b is maximum");
                return b;
            }
            else if ((c>a)&&(c>b) )
            {
                System.out.println("c is maximum");
                return c;
            }

            return max;
        }
        public String grade(int[] marks,String name) {
            total = 0;
            for (int i = 0; i < marks.length; i++) {
                total = total + marks[i];
            }
            System.out.println("total is =  " + total);
            int p = (total * 100) / 500;
            System.out.println("percentage is = " + p);
            if (p < 33) {
                return name + " fail";
            } else if ((p >= 33) && (p < 50)) {
                return name + " 3rd ";
            } else if ((p >= 50) && (p < 70)) {
                return name + " 2nd";
            } else if ((p >= 70) && (p < 90)) {
                return name + " 1st ";
            } else if ((p >= 90) && (p <= 100)) {
                return name + " superb ";
            } else {
                return "nothing";
            }
        }
    }

    public static void main(String[] args)
    {
        int a=2;
        int b=3;
        Hier a1=new Hier(a,b);
        a1.add();
        a1.multi();
        a1.rev();
        a1.p();
        Mathsop a2=new Mathsop(a);
        int res=a2.square(6);
        System.out.println(res);
        int res1 =a2.cube(6);
        System.out.println(res1);
        double res3 = a2.max(1,2,5);
        System.out.println(res3);
        int[] marks={33,72,53,64,45};
        String res2 =a2.grade(marks," rahul");
        System.out.println(res2);


    }


}
