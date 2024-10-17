package Constructor;

public class Obj
{
            int a;
            int b;
            public void add(){
                int sum=a+b;
                System.out.println("sum is"+sum);


    }
    public void mul(){
                int mul=a*b;
        System.out.println("multi is "+ mul);
    }
    public static void main(String[] args) {
        Obj aone=new Obj();
        aone.a=15;
        aone.b=20;
        aone.add();
        aone.mul();
    }

}
