package Constructor;

public class MathsOperation
{
    String name; int grade;  int total;
    int a; double max;
    public int[] marks;
    public MathsOperation(int a)
    {
        this.a=a;
    }

    public int square()
        {
            int sq =a*a;

            return sq;
        }
        public int  cube()
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
        public String grade(int[] marks,String name)
        {
            total= 0;
            for(int i=0;i<marks.length;i++)
            {
                total=total+marks[i];
            }
            System.out.println("total is =  " + total);
            int p= (total*100)/500;
            System.out.println("percentage is = "+ p );
            if (p<33)
            {
                return name+ " fail";
            }
            else if ((p>=33)&&(p<50))
            {
                return name+" 3rd ";
            }
            else if ((p>=50)&&(p<70 ))
            {
                return name+" 2nd";
            }
            else if ((p>=70)&&(p<90))
            {
                return name+" 1st ";
            }
            else if ((p>=90)&&(p<=100))
            {
                return name+" superb ";
            }
            else{
                return "nothing";
            }
        }


    public static void main(String[] args)
    {
        int a=2;

        MathsOperation a1=new MathsOperation(a);
        a1.square();
        a1.cube();
        a1.max(1,2,5);

        int[] marks={33,72,53,64,45};

        a1.grade(marks," rahul");

    }


}
