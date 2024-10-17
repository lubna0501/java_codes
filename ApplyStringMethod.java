package String;

import java.util.Locale;

public class ApplyStringMethod
{
    public static void main(String[] args)
    {
        String a= " i am a Student iii aaa sss tt uu  ddd eee nnt ttt";
        String b="  android ";
        System.out.println(a);
        System.out.println( a.isEmpty());
        System.out.println(a.isBlank());
        System.out.println(a.length());
        System.out.println(a.concat( b));
        System.out.println(a.replace(" a","j"));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        //length
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of characters in a string: " + count);

// min max occuring char
        int[] freq = new int[a.length()];
        char minChar = a.charAt(0), maxChar = a.charAt(0);
        int i, j, min, max;


        char string[] = a.toCharArray();

        for(i = 0; i < string.length; i++) {
            freq[i] = 1;
            for(j = i+1; j < string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    freq[i]++;

                    string[j] = '0';
                }
            }
        }


        min = max = freq[0];
        for(i = 0; i <freq.length; i++) {

            if(min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = string[i];
            }

            if(max < freq[i]) {
                max = freq[i];
                maxChar = string[i];
            }
        }

        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("Maximum occurring character: " + maxChar);
        // removing white space
       //1st way
        String noSpaceStr = a.replaceAll("\\s", ""); // using built in method
        System.out.println(noSpaceStr);

        //2nd way
        char[] strArray = a.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int l= 0; l < strArray.length; l++) {
            if ((strArray[l] != ' ') && (strArray[l] != '\t')) {
                stringBuffer.append(strArray[l]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println(noSpaceStr2);
//         nit123
//        String str = " nit";
//        int no =1234;
//        System.out.println("String = "+str);
//        String res = str +  no;
//        System.out.println(res);
        // nit123
//        String name="nitesh";
//        int no = 123456789;
//        for(int h = 0;h<=name.length(3); h++)
//        {
//            for(int j=0; j<=h)
//        }

    }
    }








