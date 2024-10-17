package excep;

public class ex1
{
    public static void main(String[] args) {
        int[] marks={1,3,4,5};

        //System.out.println(" remaining code");
        try{
            System.out.println(marks[5]);
            System.out.println();
        }
        catch(Exception c){
            c.printStackTrace();
        }

        System.out.println(" remaining code");
    }
}
