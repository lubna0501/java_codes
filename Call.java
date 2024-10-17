package chaining;
import java.util.Scanner;
public class Call extends Mop {
    int aa,b;
    public Call( int num, int a ,int[] marks,String name,int aa, int b){
        super(num,a,marks,name);
        this.aa = aa;
        this.b = b;
    }


    public void add(){
        int sum = aa+b;
        System.out.println("The sum is: "+sum);
    }
    public void mul(){
        int mul = aa*b;
        System.out.println("Multiplication: "+mul);
    }
    public void divide(){
        double div = aa/b;
        System.out.println("Division: "+div);
    }
    public void sub(){
        int sum = b-aa;
        System.out.println("Substraction: "+sum);
    }
    public void modulus(){
        int sum = aa%b;
        System.out.println("Modulus "+sum);
    }

    public static void main(String[] args) {
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
        Call ca = new Call(3,5,marks,"Annu",8,6);
        ca.SumOfDigit();
        ca.ProductOfDigit();
        ca.PalindromeOrNot();
        ca.Reverse();
        ca.square();
        ca.cube();
        ca.max(3.00,4.00,5.00);
        ca.grade();
        ca.add();
        ca.mul();
        ca.sub();
        ca.divide();
        ca.modulus();
    }
}
