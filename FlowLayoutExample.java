import java.awt.*;
public class FlowLayoutExample extends Frame
{
 FlowLayoutExample()
 {
  
  super("My Layouts");
  
   Button btn1=new Button("Button1");
   Button btn2=new Button("Button2");
   Button btn3=new Button("Button3");
  
   
 FlowLayout b1=new FlowLayout(FlowLayout.CENTER);
 setLayout(b1);

 add(btn1);
 add(btn2);
 add(btn3);
 
 setSize(300,300);
 setVisible(true);
 
 }

 public static void main(String s[])
 {
  new FlowLayoutExample();
 }
}