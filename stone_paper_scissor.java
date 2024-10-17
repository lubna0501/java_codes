package com.company;
import java.util.Random;
import java.util.Scanner;
public class stone_paper_scissor
{
    public static void main(String[] args)
    {
        System.out.println("enter your choice  ->  \n  1 = stone  \n  2 = paper   \n  3 = scissor " );
        Scanner sc= new Scanner(System.in);
        int yourchoice =sc.nextInt();
        if (yourchoice==1)
        {
            System.out.println("you select stone");
        }
        else if (yourchoice==2)
        {
            System.out.println("you select paper");
        }
        else if (yourchoice==3)
        {
            System.out.println("you select scissor");
        }

        Random random=new Random();
        int computerchoice =random.nextInt(4);
        System.out.println("computer choice is -> ");

        if ( computerchoice==1)
        {
            System.out.println("computer select stone");
        }
        else if (computerchoice==2)
        {
            System.out.println("computer select paper");
        }
        else if (computerchoice==3)
        {
            System.out.println("computer select scissor");
        }

        System.out.println("the winner is -> ");
        if (yourchoice==computerchoice)
        {
            yourchoice+=1;
            computerchoice+=1;
            System.out.println("match draw");
        }
        else if(yourchoice==1   && computerchoice==3)
        {
            yourchoice+=1;
            System.out.println("you win this round");
        }
        else if(yourchoice==2 && computerchoice==1)
        {
            yourchoice+=1;
            System.out.println("you win this round");
        }
        else if(yourchoice==3  &&  computerchoice==2)
        {
            yourchoice+=1;
            System.out.println("you win this round");
        }


    }
}
