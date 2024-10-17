package excep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class inputoutputexception
{
    private static String filepath = "C:\\Users\\lubna\\OneDrive\\Desktop";

    public static void main(String[] args)
    {
        BufferedReader br1 = null;
        String curline;

        try
        {
            br1 = new BufferedReader(new FileReader(filepath));

            while ((curline = br1.readLine()) != null)
            {
                System.out.println(curline);
            }
        }
        catch (IOException  e)
        {
            System.err.println("IOException found :" + e.getMessage());
        } finally
        {
            try
            {
                if (br1 != null)
                    br1.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(" exception occur.....");
    }
}
