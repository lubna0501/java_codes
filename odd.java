package excep;
import java.util.Scanner;
public class odd
{



    void number(int a) throws supers
    {
        if(a%2==1)
        {
            throw  new supers (" no is odd");
        }
    }
    public static void main(String[] args)
    {
        int a;
        odd o1=new odd();
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter no");
        a=sc.nextInt();
        try{
            o1.number(a);
            System.out.println("even no ");
            System.out.println(" no is odd");
        }
        catch( supers e){
            e.printStackTrace();
    }
    }
}



