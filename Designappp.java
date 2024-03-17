import java.awt.*;
import java.awt.event.*;
class Designappp extends Frame
{
 Label l1;
 TextField tf1;
 List lst;
 Designappp()
 {
  super("Design Application");
  setVisible(true);
  setLayout(null);
  setSize(500,450);
  
  l1=new Label("Output: ");
  l1.setBounds(50,100,80,20);

  tf1=new TextField(10);
  tf1.setBounds(200,100,120,20);
  
  lst=new List(3,false);
  lst.add("Ahmedabad");
  lst.add("Bangalore");
  lst.add("Kohzikode");
  lst.add("Kolkata");
  lst.add("Lucknow");
   
  add(l1);
  add(lst);
  add(tf1);
  lst.setBounds(60,50,170,20);
  lst.addItemListener(new ItemListener()
  {
     public void itemStateChanged(ItemEvent e)
         {
         List lst=(List)e.getSource(); 

         String i=lst.getSelectedItem();
         
         if(i.equals("Ahmedabad"))
         {
           tf1.setText("Ahmedabad");
         }
         if(i.equals("Bangalore"))
         {
           tf1.setText("Bangalore");
         }
         if(i.equals("Kohzikode"))
         {
           tf1.setText("Kohzikode");
         }
         if(i.equals("Kolkata"))
         {
            tf1.setText("Kolkata");
         }
         if(i.equals("Lucknow"))
         {
           tf1.setText("Lucknow");
         }
        }
       });
       addWindowListener(new WindowAdapter()
       {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
       });
     }
  
  public static void main(String s[])
  {
   new Designappp();
  }
}