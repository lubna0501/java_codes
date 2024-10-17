package Constructor;

public class Calculator
{
    int a;
    int b;
    public void add(){
        int sum=a+b;
        System.out.println("sum is"+sum);
    }
    public void sub(){
        int sub=a-b;
        System.out.println("sub is"+sub);
    }
    public void divide(){
        int divide=a/b;
        System.out.println("divide is"+divide);
    }
    public void mul(){
        int mul=a*b;
        System.out.println("multi is "+ mul);
    }
    public void modules(){
        int modules=a%b;
        System.out.println("modules is"+modules);
    }
    public static void main(String[] args) {
        Calculator aone=new Calculator();
        aone.a=15;
        aone.b=20;
        aone.add();
        aone.mul();
        aone.divide();
        aone.sub();
        aone.modules();
    }
}
