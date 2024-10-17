package Constructor;

import java.util.Scanner;

public class Mathsop  extends NumberOp
{
    String name;
    int a; double max;
    int[] marks;
    public Mathsop(String s, int k, int a,int[] marks,String name)
    {
        super(s,k);
        this.a=a;
        this.marks=marks;
        this.name = name;
    }

    public int square()
    {
        return a*a;


    }
    public int  cube()
    {
        return a*a*a;


    }
    public  double max (double a,double b,double c)
    {
        if ((a>=b) && (a>=c))
        {
            System.out.println("a is maximum");
            return a;
        }
        else if ((b>=a)&&(b>=c))
        {
            System.out.println("b is maximum");
            return b;
        }
        else
        {
            System.out.println("c is maximum");
            return c;
        }

    }
    public String grade()
    {
        float total= 0,avg,p;
        for(int i=0;i<marks.length;i++)
        {
            total=total+marks[i];
        }
        System.out.println("total is =  " + total);
         p= (total/500)*100;
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
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("enter the element");
        for(i=0; i<n;i++){
            marks[i] = sc.nextInt();
        }
        Mathsop mone = new Mathsop("We are learning Android",12345,6,marks,"Anuj");
        mone.reverse();
        mone.count();mone.replace();
        mone.add();mone.multi();mone.rev();mone.p();
        mone.square();
        mone.cube();
        mone.max(6.00,76.00,67.00);
        mone.grade();
    }


}
