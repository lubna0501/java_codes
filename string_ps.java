package com.company;

public class string_ps
{
    public static void main(String[] args)
    {
        //convert string into lowercase
        String name= ("Ana   Mi  kA");
        System.out.println(name);
        String a= name. toLowerCase();
        System.out.println(a);
        String c =name.replace((" "),("__"));
        System.out.println(c);

       String u ="dear <|name|>, thanks a lot!";
        u= u.replace("<|name|>","anamika");
        System.out.println(u);
        System.out.println("dear anamika ,\n  this is nice code .\n continue");
        // check double or tripple space
        System.out.println(name.indexOf("   "));
        System.out.println(name.indexOf("    "));

    }
}
