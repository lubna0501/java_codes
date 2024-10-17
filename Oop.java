package chaining;
import java.util.Scanner;
public class Oop extends Mop{
    int min,max;
    public Oop(int a, int num, int[] marks, String name, int min, int max){
        super(a,num,marks,name);
        this.min = min;
        this.max = max;
    }
    public void printtable(){
        int c , d;
        for (c = min; c <= max; c++) {
            System.out.println("Multiplication table of "+c);

            for (d = 1; d <= 10; d++) {
                System.out.println(c+"*"+d+" = "+(c*d));
            }
        }
    }
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:") ;
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter the elements") ;
        for(i=0;i<n;i++)
        {
            marks[i] = sc.nextInt();
        }

        Oop mon = new Oop(6,8,marks,"anuj",2,11);
        mon.SumOfDigit();
        mon.ProductOfDigit();
        mon.PalindromeOrNot();
        mon.Reverse();
        mon.square();
        mon.cube();
        mon.max(3.00,4.00,5.00);
        mon.grade();
        mon.printtable();

    }
}
