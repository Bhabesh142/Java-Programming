import java.awt.*;
class Border
{
 public static void main(String s[])
 {
  Frame fm=new Frame("Chat Frame");

   fm.setVisible(true);
   fm.setSize(500,450);

   TextArea t1=new TextArea(30,50);

   TextField tf1=new TextField(20);

   Label l1=new Label("Enter Text: ");

   Button b1=new Button("Send");
   Button b2=new Button("Reset");

   MenuBar mb=new MenuBar();
   fm.setMenuBar(mb);
   Menu m1=new Menu("File");
   Menu m2=new Menu("Help");
   mb.add(m1);
   mb.add(m2);
   
   MenuItem ma=new MenuItem("Open");
   MenuItem mc=new MenuItem("Save As");
   m1.add(ma);
   m1.add(mc);
   
   BorderLayout bl=new BorderLayout(20,35);
 
   fm.setLayout(bl);
   fm.add(t1,BorderLayout.CENTER);

   Panel p=new Panel();
   fm.add(p,BorderLayout.SOUTH);
  
   p.add(l1);
   p.add(tf1);
   p.add(b1);
   p.add(b2);   
 }
}