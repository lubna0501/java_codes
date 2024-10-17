package Array;

import java.util.Scanner;

public class Multiarray
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your subjects");
        int size=obj.nextInt();
        int[] marks=new int[size];
        System.out.println("enter your marks");
        for(int i=0;i<size;i++)
        {
            System.out.println("enter" + (i+1) + "marks");
            marks[i] = obj.nextInt();
        }
        double multi=1;
            for(int i=0;i<size;i++)
            {
                System.out.println( multi=multi*marks[i]);
            }

    }
}
