import java.awt.*;
class SetBounds
{
 public static void main(String s[])
 {
  Frame fm=new Frame("SetBounds Method Test");
 
  fm.setSize(375,250);
  fm.setVisible(true);

  fm.setLayout(null);
  fm.setBackground(Color.YELLOW);
  
  Label l=new Label("Ent a num: ");
  l.setBackground(Color.RED);
  TextField t1=new TextField();
  Button b=new Button("Click"); 
  
  l.setBounds(80,100,120,40);
  t1.setBounds(210,100,120,40);
  b.setBounds(100,200,120,40);
  
  fm.add(b);
  fm.add(l);
  fm.add(t1);
 }
}