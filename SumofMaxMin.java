package Array;

public class SumofMaxMin {
    public static void main(String[] args) {
        int[] a={1,2,3,5,9};
        int max = a[0];
        int min=a[0];
        for( int i=0;i<a.length;i++)

        {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for( int i=0;i>a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("min is "+ min);
        System.out.println("max is "+ max);
        System.out.println("sum of max and min is "+(max+min));
        System.out.println("sub of max and min is "+(max-min));
        System.out.println("multi of max and min is "+(max*min));
        System.out.println("divide of max and min is "+(max/min));
    }


}




