package polymorphisms;
import java.util.Scanner;
public class Calculator implements Add,Subtract,Multiple,Divide
{
    int c,n,a,b;
    Scanner obj= new Scanner(System.in);
    @Override
    public  void add(int a, int b) {
        int sum=a+b;
        System.out.println(sum);

    }
    @Override
    public int add(int a, int b, int c) {
        int sum=a+b+c;
        return sum;
    }
    @Override
    public double add(int a, double b) {
        double sum=a+b;
        return sum;
    }
    @Override
    public void div(int a, int b) {
        int div=a/b;
        System.out.println(div);
    }
    @Override
    public int div(int a, int b, int c) {
        int div=a/b/c;
        return div;
    }
    @Override
    public double div(int a, double b) {
        double div=a/b;
        return div;
    }
    @Override
    public void multi(int a, int b) {
        int multi=a*b;
        System.out.println(multi);
    }
    @Override
    public int multi(int a, int b, int c) {
        int multi=a*b*c;
        return multi;
    }
    @Override
    public double multi(int a, double b) {
        double multi=a*b;
        return multi;
    }
    @Override
    public void sub(int a, int b) {
        int sub=a-b;
        System.out.println(sub);
    }
    @Override
    public int sub(int a, int b, int c) {
        int sub=a-b-c;
        return sub;
    }
    @Override
    public double sub(int a, double b) {
        double sub=a-b;
        return sub;
    }
    public void executeall()
    {
        System.out.println(" enter your choice -> 1->add,2->sub,3->multi,4->divide" );
        int choice=obj.nextInt();

        switch( choice)
        {
            case 1:
                add();
                break;

            case 2:
                sub();
                break;

            case 3:
                multi();
                break;

            case 4:
                div();
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

    public void sub() {
        System.out.println(" enter your choice -> 1-> sub with 2\n 2-> sub with 3 \n sub with double 2" );
        int ch=obj.nextInt();             //choice=ch

        switch( ch)
        {
            case 1:
                System.out.println("enter a");
                int a=obj.nextInt();
                System.out.println("enter b");
                int b=obj.nextInt();
                sub(a,b);
                break;

            case 2:
                System.out.println("enter g");
                int g=obj.nextInt();
                System.out.println("enter h");
                int h=obj.nextInt();
                System.out.println("enter i");
                int i=obj.nextInt();

                sub(g,h,i);
                break;

            case 3:
                System.out.println("enter j");
                int j=obj.nextInt();
                System.out.println("enter k");
                double k=obj.nextDouble();
                sub(j,k);
                break;




            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }
    }

    public void add() {

        System.out.println(" enter your choice -> 1-> add with 2 \n2-> add with 3 \n add with double 2");
        int ch = obj.nextInt();             //choice=ch

        switch (ch) {
            case 1:
                System.out.println(" enter a");
                int a = obj.nextInt();
                System.out.println(" enter b");
                int b = obj.nextInt();
                  add(a, b);


                break;

            case 2:
                System.out.println(" enter l");
                int l = obj.nextInt();
                System.out.println(" enter m");
                int m = obj.nextInt();
                System.out.println(" enter c");
                int c = obj.nextInt();

                int res=add(l, m, c);
                System.out.println(res);
                break;

            case 3:
                System.out.println(" enter  n");
                int n = obj.nextInt();
                System.out.println(" enter o");
                double o = obj.nextDouble();
                 add(n,o);
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }
    }
    public void multi() {
        System.out.println(" enter your choice -> 1-> multi with 2\n 2-> add with 3  \n add with double 2");
        int ch = obj.nextInt();             //choice=ch

        switch (ch) {
            case 1:
                System.out.println(" enter a");
                int a = obj.nextInt();
                System.out.println("enter b");
                int b = obj.nextInt();
                multi(a, b);
                break;

            case 2:
                System.out.print(" enter c");
                int c = obj.nextInt();
                System.out.println(" enter d");
                int d = obj.nextInt();
                System.out.println("enter e");
                int e = obj.nextInt();

                multi(c, d, e);
                break;

            case 3:
                System.out.println("enter f");
                int f = obj.nextInt();
                System.out.println("enter g");
                double g = obj.nextDouble();
                multi(f, g);
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }
    }

    public void div() {
        System.out.println(" enter your choice -> 1-> div with 2 \n 2-> div with 3  \n div with double 2");
        int ch = obj.nextInt();             //choice=ch

        switch (ch) {
            case 1:
                System.out.println(" enter a");
                int a = obj.nextInt();
                System.out.println("enter b");
                int b = obj.nextInt();
                div(a, b);
                break;

            case 2:
                System.out.print(" enter c");
                int c = obj.nextInt();
                System.out.println(" enter d");
                int d = obj.nextInt();
                System.out.println("enter e");
                int e = obj.nextInt();

                div(c, d, e);
                break;

            case 3:
                System.out.println("enter f");
                int f = obj.nextInt();
                System.out.println("enter g");
                double g = obj.nextDouble();
                div(f, g);
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }
    }



    public static void main(String[] args)
    {
        Calculator c1=new Calculator();
       // c1.executeall();
    }
}
