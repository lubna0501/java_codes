import java.io.FileOutputStream;

public class OutputStream {


        public static void main(String args[]){
            try{
                FileOutputStream fout=new FileOutputStream("D:\\notepad.txt");
                fout.write(65);
                fout.write(66);
                fout.write(67);
                fout.close();
                System.out.println("success...");
            }catch(Exception e)
            {
                System.out.println(e);}

    }
}
