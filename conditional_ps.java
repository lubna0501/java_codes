package com.company;
import java.util.Scanner;

public class conditional_ps
{
    public static void main(String[] args)
    {
        //problem 1
        Scanner sc = new Scanner(System.in);
       // System.out.println("enter your URL -> ");
        //String a = sc.next();
        //System.out.println("enter your day-> ");
        //int day= sc.nextInt();

       /* if(a.endsWith("com"))
        {
            System.out.println("commerical website");
        }
        else if (a.endsWith("org"))
        {
            System.out.println("organizational website");
        }
        else if (a.endsWith("in"))
        {
            System.out.println("indian website");
        }
        */
        //problem 2
       /* switch (day){
            case 1:
            {
                System.out.println("monday");
                break;
            }
            case 2:
            {
                System.out.println("tuesday");
                break;
            }
            case 3:
            {
                System.out.println("wednesday");
                break;
            }
            case 4:
            {
                System.out.println("thrusday");
                break;
            }
            case 5:
            {
                System.out.println("friday");
                break;
            }
            case 6:
            {
                System.out.println("saturday");
                break;
            }
            case 7:
            {
                System.out.println("sunday");
                break;
            }
        }
        */

        //report card
       /* System.out.println("enter your  english marks -> ");
        float m = sc.nextFloat();
        System.out.println("enter your  hindi marks -> ");
        float n = sc.nextFloat();
        System.out.println("enter your maths marks -> ");
        float o = sc.nextFloat();
        float sum=(m+n+o)/3.0f;
        System.out.println("sum  your  marks -> ");
        System.out.println(sum);

        if(sum>=40  &&  m>=33 &&  n>=33 &&  o>=33  )
        {
            System.out.println(" congrats , u passed the exam ...");
        }
         else if(sum<=33 )
        {
            System.out.println("  u failed the exam , try again ...");
        }
         */
        /*
        float tax=0;
        System.out.println("enter your income -> ");
        float income= sc.nextFloat();
        if(   income<=2.5f )
        {
            tax= tax+0;
            System.out.println(" your tax is ->   " + tax);
        }
        else if(income>=2.5f && income<=5.0f )
        {
            tax=tax+0.05f*(income-2.5f);
            System.out.println(" your tax is ->   " + tax);
        }
        else if(income>=5.0 && income<=10.0f )
        {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5.0f);
            System.out.println(" your tax is ->   " + tax);
        }
        else if(income>10.0f)
        {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5.0f);
            tax=tax+0.3f*(income-10.0f);
            System.out.println(" your tax is ->   " + tax);
        }
        */
        // checking year is leap or not
        System.out.println("enter your year -> ");
        int year= sc.nextInt();

        System.out.println(year);
        if(year/4==0 && year/400==0  &&  year/100==0);
        {
            System.out.println(" leap year ");
        }

    }
}
