class Democalc
{
 void add(int a,int b)
 {
  int c=a+b;
  System.out.println("The addition of two number is: " + c);
 }
 void add(double a,double b)
 {
  double x=a+b;
  System.out.println("The addition of two number is: " + x);
 }
 void add(float a,float b,float c)
 {
  float s=a+b+c;
  System.out.println("The addition of three float number is: " + s);
 }
 void add(int a,double b)
 {
  double y=a+b;
  System.out.println("The answer is: " +  y);
 }
 void add(double a,int b)
 {
  double z=a+b;
  System.out.println("The answer is: " +  z);
 }
}
class Methodoverld
{
 public static void main(String s[])
 {
  Democalc ca=new Democalc();
  ca.add(10,20);
  ca.add(2.55,3.45);
  ca.add(3.5f,7.5f,4.5f);
  ca.add(5.905,7);
  ca.add(6,4.505);
 }
}