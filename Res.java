package chaining;
import java.util.Scanner;

public class Res extends Aop {
    int[] m;


    String name;
    public Res(int num,int[] marks, int[] m, String name){
        super(num, marks);
        this.m = m;
        this.name = name;
    }

    public void Calculate(){
        int sum = 0;
        for(int i =0; i<m.length;i++){
            sum += m[i];
        }
        System.out.println("Marks of "+name+" are "+sum);

    }
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:") ;
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter the element: ");
        for(i=0;i<n;i++)
        {
            marks[i] = sc.nextInt();
        }
        int[] m =  {67,98,78,90, 89};
        Res reso  = new Res(56,marks,m,"Chirag");
        reso.SumOfDigit();
        reso.ProductOfDigit();
        reso.PalindromeOrNot();
        reso.Reverse();
        reso.linearsearch();
        reso.Ascending();
        reso.Descending();
        reso.MaxElement();
        reso.MaxElement();
        reso.Calculate();
    }
}
