package Interfaces;

public class First implements Add ,sub {

    @Override
    public int add(int a, int b) {
        int sum=a+b;
        return sum;
    }

    @Override
    public int sub(int a, int b) {
        int sub =a-b;
        return sub;
    }

    public static void main(String[] args) {
        First f1=new First();
        int res=f1.add(2,3);
        System.out.println(res);
        int res1=f1.sub(2,3);
        System.out.println(res1);

    }
}
