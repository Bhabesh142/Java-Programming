import java.awt.*;
class Arithmetic
{
 public static void main(String s[])
 {
  Frame fm=new Frame("Arithmetic Operation");
  
   fm.setVisible(true);
   fm.setSize(300,250);
  
  Label l1=new Label("Enter num1: ");
  TextField tf1=new TextField(8);
	
  Label l2=new Label("Enter num2: ");
  TextField tf2=new TextField(8);  

  Button b1=new Button("Add");
  Button b2=new Button("Sub");
  Button b3=new Button("Multi");
  Button b4=new Button("Div");
  Button b5=new Button("Percent");
  
  Button b6=new Button("Result");
  TextField tf3=new TextField(10);
  
  Button b7=new Button("Exit");

  Panel p=new Panel();
   
  fm.add(p);
 
  p.add(l1);
  p.add(tf1);
  p.add(l2);
  p.add(tf2);
  p.add(b1);
  p.add(b2);
  p.add(b3);
  p.add(b4);
  p.add(b5);
  p.add(b6);
  p.add(tf3);
  p.add(b7);
 }
}