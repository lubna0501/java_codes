package chaining;
import java.util.Scanner;
public class Aop extends Nop
{
    int i,search,f=0, temp=0;
    int n;
    int[] marks;
    Scanner sc = new Scanner(System.in);
    public Aop(int num,int[] marks){
        super(num);
        this.marks = marks;
    }
    public void linearsearch(){
        System.out.println("Enter the element to be searched");
        search = sc.nextInt();
        for(i=0;i<marks.length;i++)
        {
            if(marks[i]==search)
            {
                System.out.println("Element "+search+" found at "+i+" position");
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Element "+search+" not found");
        }
    }
    public void Ascending() {
        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] > marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for ( i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
    public void Descending(){
        for ( i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] < marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in descending order: ");
        for (i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
    public void MaxElement(){
        if(marks.length <= 0)
        {
            System.out.println("Invalid Array Size");
        }
        else
        {
            int  Max = marks[0];
            for( i = 0; i < marks.length; i++) {
                if (marks[i] > Max) {
                    Max = marks[i];
                }
            }
            System.out.println("\nThe maximum element in the array : " + Max);
        }
    }
    public void MinElement(){
        if(marks.length <= 0)
        {
            System.out.println("Invalid Array Size");
        }
        else
        {
            int  Min = marks[0];
            for( i = 0; i < marks.length; i++) {
                if (marks[i] < Min) {
                    Min = marks[i];
                }
            }
            System.out.println("\nThe minimum element in the array : " + Min);
        }
    }

}
