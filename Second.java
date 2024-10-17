package abstraction;

public class Second extends Ex1
{





    @Override
    public void reverse(int no) {
        int sum=0;
       while(no!=0)
       {
           int r=no%10;
           sum=sum*10+r;
           no=no/10;

       }
       System.out.println(sum);
    }
}
