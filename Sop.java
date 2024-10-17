package chaining;
import java.util.Scanner;
public class Sop extends Aop{
    String s;
    String str ;

    char[] ch;
    String rev="";
    int i, count =0,j;
    public Sop(int num,int[] marks,String s){
        super(num, marks);
        this.s = s;
        str = s.toLowerCase();
        ch = str.toCharArray();
    }

    public void reversestring(){
        for( i=ch.length-1;i>=0;i--){
            rev =rev + ch[i];
        }
        System.out.println(rev);
    }
    public void countchar(){
        for(i = 0; i < str.length(); i++)
            if (str.charAt(i) != ' ')
                count++;
        System.out.println("Total number of characters in the string: " + count);
    }
    public void remoespace(){
        String scc = str;
        scc = scc.replaceAll("\\s", "");
        System.out.println(scc);
    }
    public void charreplace(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Character to be replaced: ");
        String c = sc.next();
        String f = c.toLowerCase();
        char a = f.charAt(0);
        System.out.println("Character to be replaced with: ");
        String d = sc.next();
        String g = d.toLowerCase();
        char e = g.charAt(0);
        String st = str.toLowerCase();
        char[] ca = st.toCharArray();
        for( j = 0; j< ca.length;j++)
        {
            if(a == ca[j])
            {
                ca[j]= e;
            }
        }
        System.out.println(ca);
    }
    public void replaceword(){
        String scc = str;
        scc = scc.replaceAll("lord shiva","ganesha");
        System.out.println(scc);
    }
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:") ;
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter the elements") ;
        for(i=0;i<n;i++)
        {
            marks[i] = sc.nextInt();
        }
        Sop sone = new Sop(123,marks,"Ankur");
        sone.linearsearch();
        sone.Ascending();
        sone.Descending();
        sone.MaxElement();
        sone.MinElement();
        sone.reversestring();
        sone.countchar();
        sone.remoespace();
        sone.charreplace();
        sone.replaceword();
        sone.SumOfDigit();
        sone.ProductOfDigit();
        sone.PalindromeOrNot();
        sone.Reverse();
    }
}
