import java.awt.*;
class Registration
{
 public static void main(String s[])
 {
  //Color cw=new Color(51,204,255);
  Frame fm=new Frame("Registration Panel");
   
   fm.setVisible(true);
   fm.setSize(2000,1500);
   fm.setBackground(Color.green);
   //fm.setForeground(Color.black);
   
   Label l1=new Label("Name: ");
   TextField tf1=new TextField(10);
    
   Label l2=new Label("Address: ");
   TextArea ta=new TextArea(6,8);
   
   Label l3=new Label("Email-Id: ");
   TextField tf2=new TextField(8);

   Label l4=new Label("Phone no: ");
   TextField tf3=new TextField(10);
  
   Label l5=new Label("Gender: ");
   
   CheckboxGroup cbg=new CheckboxGroup();
  
   Checkbox ck1=new Checkbox("Male",true);    
   Checkbox ck2=new Checkbox("Female",false);
   Checkbox ck3=new Checkbox("Other",false);

   Label l6=new Label("Country: ");
    Choice c=new Choice();    
        c.add("Australia");
        c.add("Germany");
        c.add("India");  
        c.add("NewYork");
        c.add("Netherlands");   
        c.add("Spain");
        c.add("Switzerland");    
        c.add("UnitedStates"); 
        c.add("VaticanCity");
   
   Label l7=new Label("Qualification: ");
    List lst=new List(3,true);
     lst.add("1-B.Sc/B.A");
     lst.add("2-B.E/B.Tech");
     lst.add("3-M.Sc/MCA");	
     lst.add("4-M.Tech/M.S");
     lst.add("5-Phd/Doctrate");
     lst.add("6-PostDoctoral");
  
   Label l8=new Label("Hobbies: ");
    Checkbox c1=new Checkbox("Playing Cricket",true);
    Checkbox c2=new Checkbox("Drawing sketches",false);
    Checkbox c3=new Checkbox("Riding Cycle",false);
    Checkbox c4=new Checkbox("Web Surfing",false);
    Checkbox c5=new Checkbox("Collecting Stamps",false); 
   
   Button b1=new Button("Submit");
   b1.setBackground(Color.yellow);
   Button b2=new Button("Reset");
   b2.setBackground(Color.yellow);
   
   Panel p=new Panel();

   fm.add(p);

   p.add(l1);
   p.add(tf1);
   p.add(l2);
   p.add(ta);
   p.add(l3);
   p.add(tf2);
   p.add(l4);
   p.add(tf3);
   p.add(l5);
   p.add(ck1);
   p.add(ck2);
   p.add(ck3);
   p.add(l6);
   p.add(c);
   p.add(l7);
   p.add(lst);
   p.add(l8);
   p.add(c1);
   p.add(c2);
   p.add(c3);
   p.add(c4);
   p.add(c5);
   p.add(b1);
   p.add(b2);
 }
}