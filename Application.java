import java.awt.*;
import java.awt.event.*;
class Application extends Frame implements ActionListener
{
 TextField tf;
 Button b1;
 Button b2;
 Button b3;
 Application()

  {
   
   super("Background Color");
   setVisible(true);
   setLayout(null);
   setSize(500,450);
   setBackground(Color.ORANGE);
   
   tf=new TextField();
   b1=new Button("RED");
   b2=new Button("GREEN");
   b3=new Button("BLUE");
  
   tf.setBounds(60,50,170,20);
   b1.setBounds(100,120,80,30);
   b2.setBounds(100,120,80,30);
   b3.setBounds(100,120,80,30);

   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
  
   add(tf);
   add(b1);
   add(b2);
   add(b3);
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
   b1.setBackground(Color.RED);
   b2.setBackground(Color.GREEN);
   b3.setBackground(Color.BLUE);

  }
  public static void main(String s[])
  {
   new Application();
  }
 } 