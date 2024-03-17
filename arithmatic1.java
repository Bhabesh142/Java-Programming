import java.awt.*;
import java.awt.event.*;
class arithmatic1 implements ActionListener
{
    Frame f;
    Label l1,l2,l3;
    Button b1,b2,b3,b4,b5;
    TextField tf1,tf2,tf3;
    arithmatic1()
    {
        f=new Frame("Arithmetic");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,400);

        l1=new Label("Ent num1:");
        l1.setBounds(50,100,100,20);

        l2=new Label("Ent num2:");
        l2.setBounds(50,140,100,20);

        l3=new Label("Print:");
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
        b1.setBackground(Color.GREEN);

        b2=new Button("Sub");
        b2.setBounds(150,250,50,20);
        b2.addActionListener(this);
        b2.setBackground(Color.RED);

        b3=new Button("Mul");
        b3.setBounds(250,250,50,20);
        b3.addActionListener(this);
        b3.setBackground(Color.BLUE);

        b4=new Button("Div");
        b4.setBounds(350,250,50,20);
        b4.addActionListener(this); 
        b4.setBackground(Color.ORANGE);
    
        b5=new Button("Exit");
        b5.setBounds(450,250,50,20);
        b5.addActionListener(this); 
        b5.setBackground(Color.YELLOW);
        
    f.addWindowListener(new WindowAdapter()
     {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    });

        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);   
    }

    public void  actionPerformed(ActionEvent e)
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
           System.exit(0);
        }
   }
   public static void main(String s[])
    {
       arithmatic1 a= new arithmatic1();
    }
}