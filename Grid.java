import java.awt.*;
class Grid
{
 public static void main(String s[])
 {
  Frame fm=new Frame("JPanel");
 
  fm.setSize(250,350);
  fm.setVisible(true);
  
  TextField t=new TextField(250);
  BorderLayout bl=new BorderLayout(20,25);
  fm.setLayout(bl);
  Panel p1=new Panel();
  fm.add(p1,BorderLayout.NORTH);

  Panel p2=new Panel();
  GridLayout gl=new GridLayout(4,3,2,2);
  p2.setLayout(gl);
  fm.add(p2,BorderLayout.CENTER);

  Button btn1=new Button("1");    
  Button btn2=new Button("2");    
  Button btn3=new Button("3");    
  Button btn4=new Button("4");    
  Button btn5=new Button("5");    
  Button btn6=new Button("6");    
  Button btn7=new Button("7");    
  Button btn8=new Button("8");    
  Button btn9=new Button("9");
  Button btn10=new Button("*"); 
  Button btn11=new Button("0");
  Button btn12=new Button("#");   
  
   p1.add(t);
   p2.add(btn1);
   p2.add(btn2);
   p2.add(btn3);
   p2.add(btn4);
   p2.add(btn5);
   p2.add(btn6);
   p2.add(btn7);
   p2.add(btn8);
   p2.add(btn9);
   p2.add(btn10);
   p2.add(btn11);
   p2.add(btn12);
 }
}