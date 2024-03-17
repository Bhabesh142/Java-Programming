import java.util.*;
import java.sql.*;

class democonnection2
{
   public static void main(String s[])
  {
    int r,mk;
    String nm;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter roll no");
    r=sc.nextInt();
    System.out.println("Enter name");
    nm=sc.next();
    System.out.println("Enter marks");
    mk=sc.nextInt();
      try
      {
       Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ","system","tiger");   
         Statement st= cn.createStatement();
        
         PreparedStatement pst=cn.prepareStatement("insert into studentinfo1 values(?,?,?)");
          pst.setInt(1,r);
          pst.setString(2,nm);
           pst.setInt(3,mk);

          int i=pst.executeUpdate();
           if(i>0)
           System.out.println("Data inserted");
           else
           System.out.println("not inserted");
      
         
        ResultSet rs = st.executeQuery("select * from studentinfo1");
         System.out.println("Record are");
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