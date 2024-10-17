package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Search
{
    public static void main(String[] args)
    { 
        int num = 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        System.out.println(list);
        //int[] b= list;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your no for search");
         num = obj.nextInt();
        boolean isfound=false;
        for(int i=0;i<list.size();i++)
        {
            if(  num== list.get(i))
            {
                System.out.print("element found"+i+"position");
                isfound = true;
                break;
            }

        }
        if(isfound==false)
        {
            System.out.print("element not found");
        }
        System.out.println();
    }
}
