import java.awt.*;
import java.awt.event.*;
class demoevent2 extends Frame
{
 TextField tf;
 Button b;

 demoevent2()
  {
   super("Event prog.");
   setVisible(true);
   setLayout(null);
   setSize(500,450);
   
   tf=new TextField();
   b=new Button("Click Here");
  
   tf.setBounds(60,50,170,20);
   b.setBounds(100,120,80,30);

   b.addActionListener(new ActionListener()
   {
 
   public void actionPerformed(ActionEvent e)
   {
    tf.setText("Welcome");
    tf.setBackground(Color.YELLOW);
   }
  }
  );
   add(tf);add(b);

}

  public static void main(String s[])
  {
   new demoevent2();
  }
}