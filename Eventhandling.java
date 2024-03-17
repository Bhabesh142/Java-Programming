import java.awt.*;
import java.awt.event.*;
class Eventhandling extends Frame implements ActionListener
{
 TextField tf;
 Button b;
 Eventhandling()
  {
   super("My event prog");
   setVisible(true);
   setLayout(null);
   setSize(500,450);
   
   tf=new TextField();
   b=new Button("Click Here");
  
   tf.setBounds(60,50,170,20);
   b.setBounds(100,120,80,30);
   
   b.addActionListener(this);
  
   add(tf);
   add(b);
  } 
  public void actionPerformed(ActionEvent e)
  {
   tf.setText("Hello");
   tf.setBackground(Color.BLUE);
  }
  public static void main(String s[])
  {
   new Eventhandling();
  }
 }