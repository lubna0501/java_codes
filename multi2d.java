package Array;

public class multi2d
{
    public static void main(String[] args)
    {
        int[][] a;
        a=new int[2][2];

        a[0][1]=10;
        a[0][0]=1;
        a[1][0]=10;
        a[1][1]=11;
        int multi=1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                multi=multi*a[i][j];
            }
        }
        System.out.println(multi);
    }
}
