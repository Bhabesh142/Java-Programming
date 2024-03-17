import java.awt.*;
import java.awt.event.*;
class Demoevent extends Frame implements ActionListener
{
 TextField tf;
 Button b;
  Demoevent()
  {
   super("My event prog");
   setVisible(true);
   setLayout(null);
   setSize(300,300);
   
   tf=new TextField();
   b=new Button("Click Here");
  
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
   tf.setText("Hello");
   tf.setBackground(Color.RED);
 }
 public static void main(String s[])
 {
  new Demoevent();
 }
}