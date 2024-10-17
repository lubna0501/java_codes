package com.company;

import java.util.Scanner;
public class stone_paper_scissor_user

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
        System.out.println("enter your choice  ->  \n  1 = stone  \n  2 = paper   \n  3 = scissor " );
        int userchoice =sc.nextInt(4);
        System.out.println("user choice is -> ");
        if ( userchoice==1)
        {
            System.out.println("user select stone");
        }
        else if ( userchoice==2)
        {
            System.out.println("user select paper");
        }
        else if (userchoice==3)
        {
            System.out.println("user select scissor");
        }
        System.out.println("the winner is -> ");
        if (yourchoice==userchoice)
        {
            yourchoice+=1;
            userchoice+=1;
            System.out.println("match draw");
        }
        else if(yourchoice==1   && userchoice==3)
        {
            yourchoice+=1;
            System.out.println("you win this round");
        }
        else if(yourchoice==2 && userchoice==1)
        {
            yourchoice+=1;
            System.out.println("you win this round");
        }
        else if(yourchoice==3  &&  userchoice==2)
        {
            yourchoice+=1;
            System.out.println("you win this round");
        }
    }
}

