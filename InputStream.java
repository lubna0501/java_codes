import java.io.FileInputStream;

public class InputStream {

        public static void main(String args[]){
            try{
                FileInputStream fin=new FileInputStream("D:\\notepad.txt");
                int i=fin.read();
                System.out.print((char)i);
                fin.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
}
