package Array;

public class PatternJaggedArray {
    public static void main(String[] args) {

        int myarray[][] = new int[4][];

        myarray[0] = new int[]{1, 2, 3};
        myarray[1] = new int[]{1};
        myarray[2] = new int[]{1, 2, 3, 4, 5};
        myarray[3] = new int[]{1, 2, 3 };

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++)
                System.out.print(myarray[i][j] + " ");
            System.out.println();

        }
    }
}
