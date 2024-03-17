import java.awt.*;
import java.awt.event.*;
class Appp implements ActionListener
{
    Frame f;
    Button b1,b2,b3;
    TextField tf1;
    Appp()
    {

        tf1=new TextField(50);
        f=new Frame("My Program");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,400);

        b1=new Button("RED");
        b1.setBackground(Color.RED);
        b1.setBounds(50,250,50,20);
        b1.addActionListener(this);

        b2=new Button("GREEN");
        b2.setBackground(Color.GREEN);
        b2.setBounds(100,250,50,20);
        b2.addActionListener(this);

        b3=new Button("BLUE");
        b3.setBackground(Color.BLUE);
        b3.setBounds(150,250,50,20); 
        b3.addActionListener(this);
        
        tf1.setBounds(200,100,100,20);
    
        f.add(tf1);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.addWindowListener(new WindowAdapter()
        {
         public void windowClosing(WindowEvent e)
         {
            System.exit(0);
         }
        }); 
     }

    public void  actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            tf1.setText("RED");
            tf1.setBackground(Color.RED);
        }
        if(e.getSource()==b2)
        {
            tf1.setText("GREEN");
            tf1.setBackground(Color.GREEN);
        }
        if(e.getSource()==b3)
        {
            tf1.setText("BLUE");
            tf1.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args)
    {
       Appp a= new Appp();
    }
 }