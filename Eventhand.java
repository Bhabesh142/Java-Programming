import java.awt.*;
import java.awt.event.*;
class Eventhand extends Frame implements ActionListener
{
 TextField tf;
 Button b;
 Eventhand()
  {
   
   super("Java Program");
   setVisible(true);
   setLayout(null);
   setSize(500,450);
   setBackground(Color.CYAN);
   
   tf=new TextField();
   b=new Button("Click-by-User");
  
   tf.setBounds(60,50,170,20);
   b.setBounds(100,120,80,30);
   
   b.addActionListener(this);
  
   add(tf);
   add(b);
   addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
   }
 });
} 
  public void actionPerformed(ActionEvent e)
  {
   tf.setText("Welcome");
   tf.setBackground(Color.ORANGE);
  }
  public static void main(String s[])
  {
   new Eventhand();
  }
 }