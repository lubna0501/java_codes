package chaining;
import java.util.Scanner;
public class Mop extends Nop{
    int a;
    int[] marks;
    String name;
    public Mop(int a, int num,int[] marks,String name) {
        super(num);
        this.a =a;
        this.marks=marks;
        this.name = name;
    }



    public int square(){
        return a*a;
    }
    public int cube(){
        return a*a*a;
    }
    public double max(double a, double b, double c){

        if(a>=b&&a>=c){
            //System.out.println("Maximum: "+a);
            return a;
        }
        else if(b>=a && b>=c){
            //System.out.println("Maximum: "+b);
            return b;
        }
        else{
            // System.out.println("Maximum: "+c);
            return c;
        }
    }
    public String grade(){
        float total = 0, avg, percentage;
        for(int i = 0; i<marks.length;i++) {

            total = total + marks[i];
        }
        avg = (float)(total / 5.0);
        percentage = (float)((total / 500.0) * 100);
        System.out.println("Total marks   = " + total + "/500.0");
        System.out.println("Average marks = " + avg);
        System.out.println("Percentage    = " + percentage + "%");
        if(percentage<=33){
            return name+" FAIL";
        }
        else if(percentage>=33 && percentage<=50){
            return name+" got 3rd Division";
        }
        else if(percentage>=50 && percentage<=70){
            return name+" got 2nd Division";
        }
        else if(percentage>=70 && percentage<=90){
            return name+" got 1st Division";
        }
        else if(percentage>=90 && percentage<=100){
            return name+" is SUPER";
        }
        else{
            return "NOTHING";
        }
    }
}
