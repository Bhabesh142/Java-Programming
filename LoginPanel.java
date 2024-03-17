import java.awt.*;
class LoginPanel
{
 public static void main(String s[])
 {
  Frame fm=new Frame("Login Panel");
 
   fm.setVisible(true);
   fm.setSize(300,250);
   fm.setBackground(Color.LIGHT_GRAY);
    
  Label l1=new Label("Centre for PostGraduate Studies,OUAT");
  l1.setBackground(Color.blue);
  l1.setForeground(Color.green);
  
  Label l2=new Label("User Id");
  TextField tf1=new TextField(10);
	
  Label l3=new Label("Password");
  TextField tf2=new TextField(9);  

  Button b=new Button("Login");
  b.setBackground(Color.green);

  Panel p=new Panel(); 
  fm.add(p);
    
  p.add(l1);
  p.add(l2);
  p.add(tf1);
  p.add(l3);
  p.add(tf2);
  p.add(b);

 }
}