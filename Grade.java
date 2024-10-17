package hashmaps;

import java.util.HashMap;

public class Grade
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> marks=new HashMap<String, Integer>();
        marks.put("vijay",435);
        marks.put("dhruv",234);
        marks.put("aakash",345);
        marks.put("rahul",435);
        int  total = 0;
        int avg;
        int p;
        for(int i=0;i<marks.size();i++)
        {
            total=total+marks.get(i);
        }
        System.out.println("total is =  " + total);
        p= (total/500)*100;
        System.out.println("percentage is = "+ p );
        for(String s: marks.keySet()){
            //System.out.println();

            if (p<33)
            {
                System.out.println(" "+ p+" =>"+ marks.get(s));
            }
            else if ((p>=33)&&(p<50))
            {
                System.out.println(" "+ p+" =>"+ marks.get(s));
            }
            else if ((p>=50)&&(p<70 ))
            {
                System.out.println(" "+ p+" =>"+ marks.get(s));
            }
            else if ((p>=70)&&(p<90))
            {
                System.out.println(" "+ p+" =>"+ marks.get(s));
            }
            else if ((p>=90)&&(p<=100))
            {
                System.out.println(" "+ p+" =>"+ marks.get(s));
            }
            else{
                System.out.println( " nothing ");
            }
        }


    }
}
