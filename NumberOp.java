package Constructor;

import Constructor.Mathsop;

import java.util.Scanner;
public class NumberOp extends Stringinh
{
    int a,n,k, sum = 0, multi =1, rnu = 0;
    public NumberOp(String s, int k)
    {
        super(s);
        this.k = k;
    }
    public void add(){
        n = k;
        while (n!=0)
        {
            a=n%10;
            sum=sum+a;
            n=n/10;

        }
        System.out.println("sum is"+sum);
    }
    public void multi(){

        n = k;
        while (n!=0)
        {
            a=n%10;
            multi=multi*+k;
            n=n/10;

        }
        System.out.println(" multiple is"+ multi);
    }
    public void rev(){

        int nu = k;
        int r_num=0;
        while(nu!=0)
        {
            a = nu%10;
            r_num=r_num*10+a;
            nu=nu/10;
        }
        System.out.println("reverse is "+r_num);
    }
    public void p(){
        int nu = k;
        int onu = k;
        while(nu !=0)
        {
            a=nu % 10;
            rnu =rnu * 10+a;
            nu=nu/10;

        }
        if(onu == rnu)
        {
            System.out.println(onu+" is  palindrome");
        }
        else
        {
            System.out.println(onu+" is not palindrome");
        }

    }


}
