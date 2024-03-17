import java.awt.*;
import java.awt.event.*;
class demoevent1 extends Frame implements ActionListener
{
 TextField tf;
 Button b;

 demoevent1()
  {
   super("Event prog.");
   setVisible(true);
   setLayout(null);
   setSize(500,450);
   
   tf=new TextField();
   b=new Button("Click Here");
  
   tf.setBounds(60,50,170,20);
   b.setBounds(100,120,80,30);
   
   outerevent oe=new outerevent(this);
   b.addActionListener(oe);
  
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
   new demoevent1();
  }
 }

 class outerevent implements ActionListener
{
  
  demoevent1 de;
  outerevent(demoevent1 de)
  {
    this.de=de;
  }
  public void actionPerformed(ActionEvent e)
  {
   de.tf.setText("Hello");
   de.tf.setBackground(Color.GREEN);
  }
}