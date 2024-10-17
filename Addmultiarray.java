package Array;

public class Addmultiarray
{
    public static void main(String[] args)
    {
        int[][] a;
        a=new int[2][2];
        int[][] b;
        b=new int[2][2];
        a[0][1]=1;
        a[0][0]=2;
        a[1][0]=4;
        a[1][1]=5;
        b[0][1]=6;
        b[0][0]=2;
        b[1][0]=3;
        b[1][1]=1;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                sum=sum+a[i][j]+b[i][j];
            }
        }
        System.out.println(sum);
    }

}
