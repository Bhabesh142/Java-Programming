import java.awt.*;
import java.awt.event.*;
class Radiobt extends Frame
{
 Label l1;
 TextField tf1;
 CheckboxGroup cbg;
 Radiobt()
 {
  super("Question & Answers");
  setVisible(true);
  setLayout(null);
  setSize(400,350);
  setBackground(Color.white);
  
  l1=new Label("1-What is your country's name.? ");
  tf1=new TextField(20);
  
  cbg=new CheckboxGroup();
  Checkbox c1=new Checkbox("India",cbg,false);
  c1.addItemListener(new ItemListener()
  {
    public void itemStateChanged(ItemEvent e)
    {
     tf1.setText("true");
    }
  });
   Checkbox c2=new Checkbox("France",cbg,false);
   c2.addItemListener(new ItemListener()
  {
    public void itemStateChanged(ItemEvent e)
    {
     tf1.setText("false");
    }
  });
   Checkbox c3=new Checkbox("Spain",cbg,false);
   c3.addItemListener(new ItemListener()
  {
    public void itemStateChanged(ItemEvent e)
    {
     tf1.setText("false");
    }
  });
   Checkbox c4=new Checkbox("Italy",cbg,false);
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

 public static void main(String s[])
 {
  new Radiobt();
 }
}