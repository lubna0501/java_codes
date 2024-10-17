package Array;

public class Pattern2JaggedArray {
    public static void main(String[] args) {
        char myarray[][] = new char[3][];

        myarray[0] = new char[]{'a','b','c','d'};
        myarray[1] = new char[]{'b','c'};
        myarray[2] = new  char[]{'d','e','f','g','h' };

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++)
                System.out.print(myarray[i][j] + " ");
            System.out.println();

        }
    }
}
