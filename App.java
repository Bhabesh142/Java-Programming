import java.awt.*;
import java.awt.event.*;
class App extends Frame
{
    TextField tf;
    Choice ch;
    App()
    {
        super("My Program");
        setVisible(true);
        setLayout(null);
        setSize(400,400);
        
        tf=new TextField();
        ch=new Choice();
        ch.add("RED");
        ch.add("BLUE");
        ch.add("GREEN");
        add(ch);
        add(tf);
        ch.setBounds(60,50,170,20);
        ch.addItemListener(new ItemListener()
        {
         public void itemStateChanged(ItemEvent e)
         {
         Choice ch=(Choice)e.getSource(); 

         String i=ch.getSelectedItem();
         
         if(i.equals("RED"))
         {
           setBackground(Color.RED);
         }
         if(i.equals("BLUE"))
         {
           setBackground(Color.BLUE);
         }
          if(i.equals("GREEN"))
         {
           setBackground(Color.GREEN);
         }
      }
     });
     addWindowListener(new WindowAdapter()
     {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    );
   }
   public void actionPerformed(ActionEvent e)
    {
       Button bt=(Button)e.getSource();
       String l=bt.getLabel();

        if(l.equals("RED"))
        {
            tf.setText("RED");
            tf.setBackground(Color.RED);
        }
        if(l.equals("BLUE"))
        {
            tf.setText("BLUE");
            tf.setBackground(Color.BLUE);
        }
        if(l.equals("GREEN"))
        {
            tf.setText("GREEN");
            tf.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args)
    {
       App a= new App();
    }
}