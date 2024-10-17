

public class Number
{
    int a,n,k,p,rev;
    int sum=0;
    public int sum(int n)
    {

        while (n!=0)
        {
            k=n%10;
            n=n/10;
            sum=sum+k;
        }
        System.out.println("sum is"+sum);
        return sum;
    }
    public int  multi(int n)
    {
        int multi=1;
        while (n!=0)
        {
            k=n%10;
            n=n/10;
            multi=multi*+k;
        }
        System.out.println(" multiple is"+ multi);
        return multi;
    }
    public int rev( int n)
    {
        int r_num=0;
        while(n>0)
        {
            r_num=(r_num*10)+(n %10);
            n=n/10;
        }
        System.out.println(r_num);
        return rev;
    }
    public int p(int n) {

        int temp = n;
        int rev = 0, digit;
        while (temp > 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;

        }
        if (rev == n) {
            System.out.println("no is  palindrome");
        } else {
            System.out.println(" no is not palindrome");
        }
        return p;
    }

    public static void main(String[] args)
    {
        Number n1=new Number();
        n1.sum(12);
        n1.multi(123);
        n1.rev(123);
        n1.p(121);
    }



}
