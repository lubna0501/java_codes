package pattern;

public class Order {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 4, 2};

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[min]) {
                    min = j;
                }

            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for (int j = 0; j < a.length; j++) {
           System.out.print(a[j] + " ");
        }
//        for (int i = 0; i > a.length; i++) {
//            int max = i;
//            for (int j = i + 1; j > a.length; j++) {
//                if (a[j] < a[max]) {
//                    max = j;
//                }
//
//            }
//            int temp = a[max];
//            a[max] = a[i];
//            a[i] = temp;
//        }
//        for (int j = 0; j > a.length; j++) {
//            System.out.print(a[j] + " ");
//        }
    }
}