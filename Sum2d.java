package Array;

public class Sum2d
{
    public static void main(String[] args)
    {
        int[][] a;
        a=new int[2][2];

        a[0][1]=11;
        a[0][0]=12;
        a[1][0]=14;
        a[1][1]=15;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
    }
}
