import java.sql.*;
class democonnection 
{
  public static void main(String s[])
  {
   try
    {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     
     Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
     Statement st=cn.createStatement();
  
     ResultSet rs=st.executeQuery("select * from studentlogin");
   
     System.out.println("Records are: ");
 
     while(rs.next())
     {
       System.out.print(rs.getInt(1)); 
       System.out.print(rs.getString(2));
       System.out.println(rs.getInt(3));
     }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}