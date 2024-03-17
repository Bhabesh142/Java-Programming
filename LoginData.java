import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class LoginData extends Frame implements ActionListener
{
  Label l1,l2,l3;
  TextField tf1,tf2;
  Button b;
  LoginData()
  {
   super("LoginPanel");
   setVisible(true);
   setSize(300,250);
   setBackground(Color.LIGHT_GRAY);
    
   l1=new Label("Centre for PostGraduate Studies,OUAT");
   l1.setBackground(Color.blue);
   l1.setForeground(Color.green);
  
   l2=new Label("User Id");
   tf1=new TextField(10);
   tf1.setBounds(20,80,50,50);
   tf1.addActionListener(this);
	
   l3=new Label("Password");
   tf2=new TextField(9);
   tf2.addActionListener(this);
   tf2.setBounds(20,110,50,50);

   b=new Button("Login");
   b.setBackground(Color.green);
   b.addActionListener(this);
   b.setBounds(20,140,50,50);
 
  add(l1);add(l2);add(l3);add(tf1);add(tf2);add(b);

   b.addActionListener(new ActionListener()
   {
     public void actionPerformed(ActionEvent e)
     {
      Label t1;
       String x=t1.getText();
       Label t2;
      String y=t2.getText();

     try
     {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
      
       PreparedStatement pst=cn.prepareStatement("select * from logindata where userid='" + x + "' && password='"+ y + "'");
       
       pst.setText(1,tf1);
       pst.setText(2,tf2);
     }
    });
   }
  }