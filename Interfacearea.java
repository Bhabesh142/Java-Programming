import java.util.*;
interface area
{
 double pi=3.14;
 double compute(double a,double b);
}
class circle implements area
{
 public double compute(double x,double y)
 {
  return (pi*x*x);
 }
}
class rect implements area
 {
  public double compute(double x,double y)
  {
   return (x*y);
  }
 }
 class demointerface
 {
  public static void main(String s[])
  {
   Scanner sc=new Scanner(System.in);
   double x,y;
   System.out.println("Ent value of x & y: ");
   x=sc.nextDouble();
   y=sc.nextDouble();
   circle cr=new circle();
   System.out.println("Circle area is: " + cr.compute(x,y));
   rect rt=new rect();
   System.out.println("Rect area is: " + rt.compute(x,y));
   sc.close();
  }
 }