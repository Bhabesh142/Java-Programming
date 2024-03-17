import java.util.*;
class PolymorphismSC
{
 void area(int l,int b)
 {
  int area=l+b;
  System.out.println("Sum is: " + area);
 }
}
class Rectangle extends PolymorphismSC
{
 void area(int l,int b)
 {
  int area=l*b;
  System.out.println("Rect area is: " + area);
 }
}
class Triangle extends PolymorphismSC
{
 void area(int l,int b)
 {
  int area=2*l*b;
  System.out.println("Tri area is: " + area);			
 }
}
class Dynamicmethoddispatch
{
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  PolymorphismSC ps=new PolymorphismSC();	
  System.out.println("Ent l & b: ");
  int l=sc.nextInt();
  int b=sc.nextInt();
  ps.area(l,b);
  ps=new Rectangle();
  ps.area(l,b);
  ps=new Triangle();
  ps.area(l,b);
  sc.close();
 }	
}