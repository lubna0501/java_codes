package Array;

import java.util.Arrays;
public class Copyarray
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int[] b=new int[a.length];
        b=Arrays.copyOf(a,a.length);
        System.out.println(b);
        for(int i=0;i<b.length;++i)
        {
            System.out.print(b[i] + " ");
        }
    }
}
