package Array;

public class Pattern3JaggedArray {
    public static void main(String[] args) {
        String myarray[][] = new String[4][];

        myarray[0] = new String[]{"ABC","RAvi","Riht"};
        myarray[1] = new String[]{"NIgh","Rahoul","ANdroid","Java"};
        myarray[2] = new String[]{"kotlin","flutter","Ract"};
        myarray[3] = new String[]{"ANdroidIOS"};

        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++)
                System.out.print(myarray[i][j] + " ");
            System.out.println();

        }
    }
}
