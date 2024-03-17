import java.util.*;
import java.sql.*;

class democonnection1
  {
   public static void main(String s[])
   {
    int r,mk;
    Scanner sc=new Scanner(System.in);
    System.out.println("Ent roll: ");
    r=sc.nextInt();
    System.out.println("Ent marks: ");
    mk=sc.nextInt();
    
    try
    {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
     Statement st=cn.createStatement();
     
     PreparedStatement pst=cn.prepareStatement("update studentdata2 set MARKS=? where ROLL=?");

     pst.setInt(1,mk);
     pst.setInt(2,r);
    
     int i=pst.executeUpdate();
     if(i>0)
      System.out.println("Data updated.");
     else
      System.out.println("Data not updated.");

    ResultSet rs=st.executeQuery("select * from studentdata2");
      
     System.out.println("Database details are: ");
    
     while(rs.next())
     {
       
      System.out.println(rs.getInt(1)); 
       System.out.println(rs.getString(2));
        System.out.println(rs.getInt(3));
     }
     sc.close();
   }
    catch(Exception e)
    {
      System.out.println(e); 
    }
  }
}