package pattern;

public class Percentage
{
    public static void main(String[] args)
    {
        int[] a={15,48,36,25,45,89,99,96,87,65};
        int sum=0, b=1;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
        int p= (sum*100)/1000;
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
