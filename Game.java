package guessno;
import java.util.Scanner;

public class Game {

    Scanner obj = new Scanner(System.in);
    int n, i, a, z, sum, answer, guess;
    int count = 1;
    String s;
    public int exit;


    public int pA(int count) {
        int a = 2 + count;
        return a;
    }

    public int pB(int count) {
        int b = 3 * count;
        return b;
    }

    public int pC(int count) {
        int c = 4 * count;
        return c;
    }

    public int pD(int count) {
        int d = 5 * count;
        return d;
    }

    public void getchoice() {
        System.out.println(" enter your choice -> \n 1-> pattern A \n 2-> pattern B \n 3-> pattern C \n 4-> pattern D");
        int choice = obj.nextInt();
        executeall(choice);
    }

    public void executeall(int choice) throws IllegalStateException {

        boolean isrunning = true;
        while (isrunning)
        {
            int num = 0;

            switch (choice)
            {
                case 1:
                    num = pA(count);
                    System.out.println(num);
                    break;

                case 2:
                    num = pB(count);
                    System.out.println(num);
                    break;

                case 3:
                    num = pC(count);
                    System.out.println(num);
                    break;

                case 4:
                    num = pD(count);
                    System.out.println(num);
                    break;


                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

            System.out.println(" enter your choice -> \n 1-> repeat \n 2-> guess  ");
            int ch = obj.nextInt();
            if (ch == 1)
            {
                isrunning = true;
                count++;
            }
            else if (ch == 2) {
                count++;
                System.out.println("Enter  the guess number ");
                guess = obj.nextInt();
                switch (choice) {
                    case 1:
                        answer = pA(count);
                        break;

                    case 2:
                        answer = pB(count);
                        break;

                    case 3:
                        answer = pC(count);
                        break;

                    case 4:
                        answer = pD(count);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }


                if (guess == answer) {
                    System.out.println(" u win ");
                } else {
                    System.out.println("u loose , Try Again: ");
                }
                System.out.println(" enter your choice -> \n 1-> play again  \n 2-> play start \n 3-> quit ");
                int decision = obj.nextInt();
                switch (decision) {
                    case 1: {
                        count++;
                    }
                    case 2: {
                        count = 0;
                        getchoice();
                    }
                    case 3: {
                        isrunning = false;
                    }
                }
            }
            }
        }
        public static void main (String[]args)
        {
            Game g1 = new Game();
            g1.getchoice();
        }
    }
