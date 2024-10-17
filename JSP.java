//PROGRAM TO INSERT DATA INTO TABLE USING JSP



import java.sql.*; import java.awt.*; import java.awt.event.*; class TestDB1
{
    public static void main(String ss[])
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c=DriverManager.getConnection("jdbc:odbc:mydsn","system","mca6"); String t1="China";
            int t2=422;
            Statement s=c.createStatement();
            s.executeUpdate("lNSERT lNTO emp " + "VALUES ('chinaaaaaaa',200000001)"); ResultSet result1=s.executeQuery("SELECT * FROM emp"); while(result1.next())
        {
            System.out.println("name : "+result1.getString(1)); System.out.println("salary : "+result1.getString(2));
        }
            System.out.println("after insertion");


        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception i)
        {
            System.out.println(i);
        }
    }
}

