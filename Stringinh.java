package Constructor;



import java.util.Scanner;
public class Stringinh
    {
        String s;
        String str;
        char[] ch;
        String rev="";
        int i,count=0,j;
        public Stringinh(String s)
        {
            this.s=s;
            str=s.toLowerCase();
            ch=str.toCharArray();
        }



        public void reverse()
        {
            for(i=ch.length-1;i>=0;i--)
            {
                rev=rev + ch[i];
            }
            System.out.println(rev);
        }
        public void count()
        {
            for(i=0;i<str.length();i++)
            {
                if(str.charAt(i) !=' ')
                {
                    count++;
                }

            }
        }
        public void replace() {
            while (i < str.length()) {
                if (str.charAt(i) != ' ') {
                    count++;
                }
                i++;
            }
            System.out.println("\n The Total Number of Characters  =  " + count);
        }

}
