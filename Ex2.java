public class Ex2
{
    public static class Result
    {
        int[] marks;
        String name;
        public Result(int[] marks,String name)
        {
            this.marks =marks;
            this.name = name;
        }
        public void calculatorres()
        {
            int sum=0;
            for(int i=0;i<marks.length;i++)
            {
                sum=sum+marks[i];
            }
            System.out.print("marks of "+ name +" are "+sum);
        }
    }

    public static void main(String[] args) {
        int[] marks={37,45,86,25,54};
        Result r1=new Result(marks,"rahul");
        r1.calculatorres();
    }
}
