package Constructor;

import java.util.Locale;

public class Stringmethod
{
    public static void main(String[] args)
    {
        String a=" ";
        String b="java ";
        String c="cbitss";
        String d="b o o k ";
        System.out.println(a.isEmpty());

        System.out.println(a.isBlank());

        System.out.println(b.toLowerCase());

        System.out.println(c.toUpperCase());

        String noSpaceStr = d.replaceAll("\\s", "");
        System.out.println(noSpaceStr);
        //finding all character in string ....
        for(int i=0; i<c.length();i++) {
            char e = c.charAt(i);
            System.out.println("char at " + i + " index is: " + e);

        }
    }
}
