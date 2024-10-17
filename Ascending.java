//package hashsets;
//
//import java.util.HashMap;
//import java.util.HashSet;
//
//public class Ascending
//{
//    public static void main(String[] args)
//    {
//        HashSet<Integer> a = new HashSet<Integer>();
//        a.add(12);
//        a.add(21);
//        a.add(72);
//        a.add(25);
//        a.add(32);
//
////        for (Integer i : a) {
////            // System.out.print(a.get(i));
////            System.out.println(" " + i + "=>" + a.get(i));
////        }
//        //HashSet<Integer> c = a;
//
//        for (int i = 0; i < a.size(); i++) {
//
//            for (int j = i + 1; j < a.size(); j++) {
//                if (a.get(i) > a.get(j)) {
//                    int temp = a[j];
//                    a[j] = a[i];
//                    a[i] = temp;
//                }
//
//            }
//
//        }
//        for (int j = 0; j < a.size(); j++) {
//            System.out.print(a[j] + " ");
//        }
//        System.out.println();
//    }
//}
