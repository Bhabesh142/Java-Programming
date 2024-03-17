import java.awt.*;
import java.awt.event.*;
class Arithmeticop extends Frame implements ActionListener
{
 Label l1,l2,l3;
 TextField tf1,tf2,tf3;
 Button b1,b2,b3,b4,b5,b6;
 Arithmeticop()
 {
  super("Arithmetic Operation");
  setVisible(true);
  setLayout(null);
  setSize(600,400);
  
  l1=new Label("Ent num1: ");
  l1.setBounds(50,100,100,20);
  
  l2=new Label("Ent num2: ");
  l2.setBounds(50,140,100,20);
  
  l3=new Label("Data: ");
  l3.setBounds(50,180,100,20);
  
  tf1=new TextField(10);
  tf1.setBounds(200,100,100,20);
  tf2=new TextField(10);
  tf2.setBounds(200,140,100,20);
  tf3=new TextField(10);
  tf3.setBounds(200,180,100,20);

  b1=new Button("Add");
  b1.setBounds(50,250,50,20);
  b1.addActionListener(this);
  b1.setBackground(Color.YELLOW);
  
  b2=new Button("Sub");
  b2.setBounds(150,250,50,20);
  b2.addActionListener(this);
  b2.setBackground(Color.GREEN);

  b3=new Button("Mul");
  b3.setBounds(250,250,50,20);
  b3.addActionListener(this);
  b3.setBackground(Color.RED);

  b4=new Button("Div");
  b4.setBounds(350,250,50,20);
  b4.addActionListener(this);
  b4.setBackground(Color.CYAN);

  b5=new Button("Percent");
  b5.setBounds(450,250,50,20);
  b5.addActionListener(this);
  b5.setBackground(Color.PINK);

  b6=new Button("Exit");
  b6.setBounds(550,250,50,20);
  b6.addActionListener(this);
  b6.setBackground(Color.ORANGE);

   addWindowListener(new WindowAdapter()
  {
    public void windowClosing(WindowEvent e)
     {
      System.exit(0);
     }
   });
   
   add(l1);
   add(tf1);
   add(l2);
   add(tf2);
   add(l3);
   add(tf3);
   add(b1);
   add(b2);
   add(b3);
   add(b4);
   add(b5);
   add(b6);
  } 

  public void actionPerformed(ActionEvent e)
  {
        int n1=Integer.parseInt(tf1.getText());
        int n2=Integer.parseInt(tf2.getText());
        if(e.getSource()==b1)
        {
            tf3.setText(String.valueOf(n1+n2));
        }
        if(e.getSource()==b2)
        {
            tf3.setText(String.valueOf(n1-n2));
        }
        if(e.getSource()==b3)
        {
            tf3.setText(String.valueOf(n1*n2));
        }
        if(e.getSource()==b4)
        {
            tf3.setText(String.valueOf(n1/n2));
        }
        if(e.getSource()==b5)
        {
            tf3.setText(String.valueOf(n1%n2));
        }
        if(e.getSource()==b6)
        {
           System.exit(0);
        }
  }
  public static void main(String s[])
  {
    new Arithmeticop();
  }
}