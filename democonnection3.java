import java.util.*;
import java.sql.*;

class democonnection3
{
   public static void main(String s[])
  {
    int r,mk;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter roll no");
    r=sc.nextInt();
    System.out.println("Enter marks");
    mk=sc.nextInt();
      try
      {
       Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");   
         Statement st= cn.createStatement();
        
         PreparedStatement pst=cn.prepareStatement("update studentinfo1 set MARKS=? where ROLL=?");
          pst.setInt(1,mk);
           pst.setInt(2,r);
          int i=pst.executeUpdate();
           if(i>0)
           System.out.println("Data updated");
           else
           System.out.println("not inserted");
      
         	
        ResultSet rs = st.executeQuery("select * from studentinfo1");
         System.out.println("Record are ");
         while(rs.next())
         {
             System.out.print(rs.getInt(1));
               System.out.print(rs.getString(2));
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