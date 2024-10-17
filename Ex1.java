package hashmaps;

import java.util.HashMap;

public class Ex1
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> marks=new HashMap<String, Integer>();
        marks.put("vijay",435);
        marks.put("dhruv",234);
        marks.put("aakash",345);
        marks.put("rahul",435);
        System.out.println(marks.get("aakash"));
        marks.remove("vijay");
      //  marks.remove(234);
        for(String s: marks.keySet()){
            System.out.println(s);
        }

        System.out.println();

//        for(String s: marks.keySet()){
//            System.out.println(s);
//        }


        for(int i: marks.values()){
            System.out.println(i);
        }

        for(String s: marks.keySet()){
           //System.out.println();
            System.out.println(" "+ s+" =>"+ marks.get(s));

        }
    }
}
