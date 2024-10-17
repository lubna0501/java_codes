package Arraylist;

import java.util.ArrayList;

public class Freq
{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(1);
        a.add(1);
        a.add(3);
        a.add(1);
        a.add(1);
        System.out.println(a);
        int [] fr = new int [a.size()];
        int visited = -1;
        for(int i = 0; i < a.size(); i++){
            int count = 1;
            for(int j = i+1; j < a.size(); j++){
                if(a.get(i) == a.get(j)){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        System.out.println(" Element -> Frequency");

        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + a.get(i) + "    ->    " + fr[i]);
        }
    }
}
