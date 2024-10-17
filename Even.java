package excep;

import java.util.Scanner;

public class Even
{
        void number(int a) throws supers
        {
            if(a%2==0)
            {
                throw  new supers (" no is even");
            }
        }
        public static void main(String[] args)
        {
            int a;
            excep.Even e1=new excep.Even();
            Scanner sc=new Scanner(System.in);
            System.out.println(" enter no");
            a=sc.nextInt();
            try{
                e1.number(a);
                System.out.println("odd no ");
                System.out.println(" no is even");
            }
            catch( supers e){
                e.printStackTrace();
            }
        }
    }





