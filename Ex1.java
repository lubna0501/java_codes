public class Ex1
{
    public static class Add
    {
        double percentage;
        public int addition(int a,int b)
        {
            int sum=a+b;
            return sum;
        }
        public String voteeligibility(int age)
        {
            if (age < 18) {
                return "you are under age";
            } else {
                return " you are eligibile";
            }
        }
        public boolean validateresult() {
            if (percentage>33)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public void multi(int a,int b)
        {
            int multi= a*b;
            System.out.print("multi is "+ multi);
        }
    }
    public static void main(String[] args)
    {
        Add aone=new Add();
        aone.percentage=34.0;
        boolean res=aone.validateresult();
        if(res){
            System.out.println("student pass");
        }
        else
        {
            System.out.println(" student fail");
        }
        int res2= aone.addition(3,5);
        System.out.println(" sum is"+ res2);
        String res3= aone.voteeligibility(19);
        System.out.println(res3);
        aone.multi(3,5);
    }
}
