//task
import java.util.Scanner;
public class Student {
    Scanner sc = new Scanner(System.in);
    int numSt;
    double[] marks;
    int total=650;
    double[] per;
    char[] grade;
    public void input(){
        System.out.println("Enter number of Student: ");
        numSt=sc.nextInt();
        marks = new double[numSt];
        per = new double[numSt];
        for(int i = 0; i<marks.length;i++){
            System.out.println("enter marks of "+(i+1)+"st Student:-");
             marks[i]=sc.nextDouble();
        }

    }
    public void Calc() {
        grade= new char[numSt];
        for (int i = 0; i < per.length; i++) {
            double getmarks = marks[i];
            double percent = (getmarks * 100) / total;
            per[i] = percent;
            if (percent < 33.00) {
                grade[i] = 'F';
            } else if ((percent >= 33) && (percent < 50)) {
                grade[i] = 'D';
            } else if ((percent >= 50) && (percent < 70)) {
                grade[i] = 'C';
            } else if ((percent >= 70) && (percent < 80)) {
                grade[i] = 'B';
            } else {
                grade[i] = 'A';
            }

        }
    }
    public void print(){
        System.out.println("FINAL RESULT OF STUDENTS");
        System.out.println("Marks       Percentage               Grade");
        for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]+"       "+per[i]+"          "+grade[i]);
        }
    }
    public static void main(String[] args){
        Student s = new Student();
        s.input();
        s.Calc();
        s.print();
    }
}
