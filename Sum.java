
package Arraylist;
import java.util.ArrayList;

public class Sum
{
    public static void main(String[] args)
    {
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add(2);
            list.add(4);
            list.add(1);
            list.add(3);
            System.out.println(list);
            int sum=0;
            for(int i=0;i<list.size();i++)
            {
                sum=sum+ list.get(i);
            }
        System.out.println(" sum of array list is ->" + sum);
    }
}
