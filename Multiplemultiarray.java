package Array;

public class Multiplemultiarray
{
    public static void main(String[] args) {
        int[][] a;
        a = new int[2][2];
        int[][] b;
        b = new int[2][2];
        a[0][1] = 10;
        a[0][0] = 28;
        a[1][0] = 4;
        a[1][1] = 15;
        b[0][1] = 6;
        b[0][0] = 32;
        b[1][0] = 3;
        b[1][1] = 11;
//        a={{1,2}};
//        b={1,2};
        int multi = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                multi = multi+ a[i][j] * b[i][j];
            }
        }
        System.out.println(multi);
    }
}
