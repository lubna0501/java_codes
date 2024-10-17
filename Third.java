package abstraction;

public class Third extends Ex1
{


    public static void main(String[] args) {
        Second s1=new Second();
        s1.reverse(123);
        s1.Sum(1,2);
        Third s2=new Third();
        s2.reverse(123);
        s2.multi(1,2);
    }

    @Override
    public void reverse(int no) {

            int multi=1;
            while(no!=0)
            {
                int r=no%10;
                multi=multi*r;
                no=no/10;

            }
            System.out.println(multi);



    }
}
