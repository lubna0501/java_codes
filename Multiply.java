package Arraylist;

import java.util.ArrayList;

public class Multiply
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        System.out.println(list);
        int multi=1;
        for(int i=0;i<list.size();i++)
        {
            multi=multi* list.get(i);
        }
        System.out.println(" multiply of array list is ->" + multi);
    }
}
