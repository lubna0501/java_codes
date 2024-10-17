package Arraylist;

import java.util.ArrayList;

public class Ascending
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(2);
        a.add(4);
        a.add(1);
        a.add(3);
        System.out.println(a);

        for (int i = 0; i < a.size(); i++)
        {
            for (int j = i + 1; j < a.size(); j++)
            {
                if (a.get(i) > a.get(j))
                {
                    int temp = a.get(j);
                    a.set(j, a.get(i));
                    a.set(i, temp);
                }
            }
        }
        for (int j = 0; j < a.size(); j++)
        {
            System.out.print(a.get(j) + " ");
        }

    }
}
