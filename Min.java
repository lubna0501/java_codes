package Arraylist;

import java.util.ArrayList;

public class Min
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(4);
        a.add(1);
        a.add(3);
        System.out.println(a);
        int min = a.get(0);
        int max = a.get(0);
        int n = a.size();
        for (int i = 1; i < n; i++) {
            if (a.get(i) < min) {
                min = a.get(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
        System.out.println("sum is " + (min+max));
        System.out.println("sub is" + (max-min));
        System.out.println(" multi is "+ max*min);
        System.out.println(" divide is "+ max/min);
        System.out.println(" modules is " + max % min);
    }
}

