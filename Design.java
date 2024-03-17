import java.awt.*;
import java.awt.event.*;
class Design extends Frame
{
 Label l1;
 TextField tf1,tf2;
 Choice c;
 Design()
 {
  super("Design Application");
  setVisible(true);
  setLayout(null);
  setSize(500,450);
  
  l1=new Label("Output: ");
  l1.setBounds(50,100,100,20);

  tf1=new TextField(10);
  tf1.setBounds(200,100,120,20);

  tf2=new TextField(10);
  
  c=new Choice();
  c.add("Ahmedabad");
  c.add("Bangalore");
  c.add("Kohzikode");
  c.add("Kolkata");
  c.add("Lucknow");
   
  add(l1);
  add(c);
  add(tf1);
  add(tf2);
  c.setBounds(60,50,170,20);
  c.addItemListener(new ItemListener()
 
 {
         public void itemStateChanged(ItemEvent e)
         {
         Choice c=(Choice)e.getSource(); 

         String i=c.getSelectedItem();
         
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
   new Design();
  }
}