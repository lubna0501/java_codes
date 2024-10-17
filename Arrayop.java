package innerclasses;
import java.util.Scanner;
public class Arrayop
{
     int f=0;
    int[] a={1,2,3,4,5};
    public void linear(int[] marks)
    {
        System.out.println("Enter the element to be searched");
        Scanner sc = new Scanner(System.in);
         int search = sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
            if( marks[i]==search)
            {
                System.out.println("Element "+search+" found at "+i+" position");
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Element "+search+" not found");
        }
    }
    public void as()
    {
        int[] c = a;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                }
            }
        }
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j] + " ");
        }
        System.out.println();
    }
    public void ds()
    {
        int[] d=a;
        for (int i = 0; i < d.length; i++) {

            for (int j = i + 1; j < d.length; j++)
            {
                if (d[i] < d[j])
                {
                    int temp = d[j];
                    d[j] = d[i];
                    d[i] = temp;
                }
            }
        }
        for (int j = 0; j < d.length; j++) {
            System.out.print(d[j] + " ");
        }
        System.out.println( );
    }
    public void min()
    {
        int[] e=a;
        int min=e[0];

        for( int i=0;i>a.length;i++)
        {
            if(e[i]<min)
            {
                min=e[i];
            }
        }
        System.out.print("min is "+ min);
        System.out.println();
    }
    public void max()
    {
        int[] f=a;
        int max = f[0];
        for( int i=0;i<a.length;i++)
        {
            if(f[i]>max)
            {
                max=f[i];
            }
        }
        System.out.println("max is "+ max);
    }
    class Stringop
    {
        String s;
        String str ;

        char[] ch;
        String rev="";
        int i, count =0,j;
        public Stringop(String s){
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
//             System.out.println(" enter string  ");
//            String st = sc.next();
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
    }



    public static void main(String[] args)
    {
         Arrayop aone=new  Arrayop();
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
        aone.linear(marks);
        aone.as();
        aone.ds();
        aone.min();
        aone.max();

        Arrayop.Stringop s1=aone.new Stringop( " rohtak delhi mumbai chandigarh");
        s1.charreplace();
        s1.countchar();
        s1.remoespace();
        s1.replaceword();
       s1.reversestring();
    }
}

