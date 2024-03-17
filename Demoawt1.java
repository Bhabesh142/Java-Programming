import java.awt.*;
class Demoawt1
{
 public static void main(String s[])
 {
  Frame fm=new Frame("My Frame");
  
   fm.setVisible(true);
   fm.setSize(200,200);
   
   Label l1=new Label("Name");
   l1.setBackground(Color.RED);
   l1.setForeground(Color.BLUE);
   
   Label l2=new Label("Phone No");
   Label l3=new Label("Address");
   Label l4=new Label("Country");

   List lst=new List(3, true);
   lst.add("item1");
   lst.add("item2");
   lst.add("item3");
   lst.add("item4");
   lst.add("item5");
  
   Button b1=new Button("Submit");
   //Button b2=new Button("Button2");
   //Button b3=new Button("Button3");
 
   TextField tf1=new TextField(10);
   TextField tf2=new TextField(10);
  
   TextArea ta=new TextArea(5,10);

   Panel p=new Panel();
   fm.add(p);

   p.add(l1);
   p.add(tf1);
   p.add(l2);
   p.add(tf2);
   p.add(l3);
   p.add(ta);
   p.add(l4);
   p.add(lst);
   p.add(b1);
   //p.add(b2);
   //p.add(b3);
  }
 }