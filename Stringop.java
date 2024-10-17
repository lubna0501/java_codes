package innerclasses;

import java.util.Scanner;

public class Stringop  {
    String s;
    String str;
    char[] ch;
    String rev = "";
    int i, count = 0, j;

    void reverse() {
        for (i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        System.out.println(rev);
    }

    void count() {
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
    }

    void replace() {
        while (i < str.length()) {
            if (str.charAt(i) != ' ') {
                count++;
            }
            i++;
        }
        System.out.println("\n The Total Number of Characters  =  " + count);
    }
    void print(){
        class  Numop{
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
                    multi=multi*+k;
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
        }
        Numop e1 = new Numop();

        e1.p();
        e1.rev();
        e1.multi();
        e1.add();

    }
    public static void main(String[] args)
    {
        Stringop s2 = new Stringop();
          s2.print();
    }


}


