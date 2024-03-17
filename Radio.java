import java.awt.*;
import java.awt.event.*;
class Radio extends Frame
{
  Label l1;
  TextField tf1;
  CheckboxGroup cbg;
  Radio()
  {
    super("Question & Answers");
    setVisible(true);
    setLayout(null);
    setSize(400,350);
    setBackground(Color.CYAN);

    l1=new Label("1-What is your country's name.?");
    l1.setBounds(50,100,180,20);
    tf1=new TextField(10);
    tf1.setBounds(50,300,150,20);

    cbg=new CheckboxGroup();
    Checkbox c1=new Checkbox("India",cbg,false);
    c1.setBounds(50,150,150,20);
    c1.addItemListener(new ItemListener()
    {
     public void itemStateChanged(ItemEvent e)
     {
       tf1.setText("true");
     }
    });
    Checkbox c2=new Checkbox("France",cbg,false);
    c2.setBounds(50,175,150,20);
    c2.addItemListener(new ItemListener()
    {
     public void itemStateChanged(ItemEvent e)
      {
       tf1.setText("false");
      }
    });
    Checkbox c3=new Checkbox("Spain",cbg,false);
    c3.setBounds(50,200,150,20);
    c3.addItemListener(new ItemListener()
    {
     public void itemStateChanged(ItemEvent e)
      {
       tf1.setText("false");
      }
    });
    Checkbox c4=new Checkbox("Italy",cbg,false);
    c4.setBounds(50,225,150,20);
    c4.addItemListener(new ItemListener()
    {
     public void itemStateChanged(ItemEvent e)
     {
      tf1.setText("false");
     }
    });
 
    addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
       System.exit(0);
      }
    });

     add(l1);
     add(c1);
     add(c2);
     add(c3);
     add(c4);
     add(tf1);
  }

  public static void main(String args[])
  {
    new Radio();
  }
}