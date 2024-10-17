package com.company;
import java.util.Scanner;

class percantage_calculator
{
    public static void main(String[]args)
    {
        System.out.println("taking input from user");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter sub 1 marks =");
        int a=sc.nextInt();
        System.out.println("enter sub 2 marks =");
        int b=sc.nextInt();
        System.out.println("enter sub 3 marks =");
        int c=sc.nextInt();
        System.out.println("enter sub 4 marks =");
        int d=sc.nextInt();
        System.out.println("enter sub 5 marks =");
        int e=sc.nextInt();
        int Sum=a+b+c+d+e;
        System.out.println("the sum of no is ->");
        System.out.println(Sum);
        System.out.println("the total  no is ->");
        int total=sc.nextInt();
        int percentage=Sum/ total;
        System.out.println("percentage is->");
        System.out.println(percentage);
    }
}


