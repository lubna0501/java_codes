package pattern;

public class Report
{
    public static void main(String[] args)
    {
        int english = 77;
        int hindi = 90;
        int maths = 27;
        int science = 45;
        int psycho = 65;
        int total= english+hindi+maths+science+psycho;
        System.out.println("total is =  " + total);
        int p= (total*100)/500;
        System.out.println("percentage is = "+ p );
        if (p<33)
        {
            System.out.println(" fail");
        }
        else if ((p>=33)&&(p<50))
        {
            System.out.println(" 3rd ");
        }
        else if ((p>=50)&&(p<70 ))
        {
            System.out.println(" 2nd");
        }
        else if ((p>=70)&&(p<90))
        {
            System.out.println(" 1st ");
        }
        else if (p>=90)
        {
            System.out.println(" superb ");
        }

    }
}
