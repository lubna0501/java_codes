package excep;

public class classnotfound
{
    public static final String CLASS_TO_LOAD = "main.java.Utils";


        public static void main(String[] args)
        {
            //
            // abc a1 = new abc();

            try {
                Class loadedClass = Class.forName(CLASS_TO_LOAD);
                System.out.println("Class " + loadedClass + " found!");
            } catch (ClassNotFoundException ex) {
                System.err.println("ClassNotFoundException was found: " + ex.getMessage());
                ex.printStackTrace();
            }
            System.out.println(" exception print ....");
        }



}
