interface area
{
 double pi=3.14;
 double compute(double a,double b);
}
class circle implements area
{
 double compute1(double x,double y)
 {
  return (pi*x*x);
 }

@Override
public double compute(double a, double b) {
    throw new UnsupportedOperationException("Unimplemented method 'compute'");
}
}
class rect implements area
{
 double compute2(double x,double y)
 {
  return (x*y);
 }

@Override
public double compute(double a, double b) {
    throw new UnsupportedOperationException("Unimplemented method 'compute'");
}
}
class Demointerface
{
 public static void main(String s[])
 {
  circle cr=new circle();
  rect rt=new rect();
  System.out.println("Area of circle is: " + cr.compute1(10,20));
  System.out.println("Area of rectng is: " + rt.compute2(10,20));
 }
}