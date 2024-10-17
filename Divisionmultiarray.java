package Array;

public class Divisionmultiarray
{
    public static void main(String[] args)
    {
        int[][] a={{1,2},{2,3}};
       // a = new int[2][2];
        int[][] b={{2,1},{1,2}};
       int[][] c  = new int[2][2];
//        a[0][1] = 10;
//        a[0][0] = 28;
//        a[1][0] = 4;
//        a[1][1] = 15;
//        b[0][1] = 6;
//        b[0][0] = 32;
//        b[1][0] = 3;
//        b[1][1] = 11;
 //      int[][]a={{1,2},{2,3}};
   //    int[][] b={{2,1},{1,2}};


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j]=  a[i][j] / b[i][j];
            }
        }
        for(int i=0;i<c.length;i++) {
            for (int j = 0; j < c.length; j++)
            {
                System.out.println(c[i][j]);
            }
        }
    }
}
