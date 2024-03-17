class MethodOverloading
{
 void add(int a,int b)
 {
  int c=a+b;
  System.out.println(c);
 }
 void add(double m,double n)
 {
  double k=m+n;
  System.out.println(k);
 }
 void add(int a,int b,int c)
 {
  int s=a+b+c;
  System.out.println(s);
 }
 void add(int a,double m)
 {
  double c=a+m;
  System.out.println(c);
 }
 void add(double m,int b)
 {
  double c=m+b;
  System.out.println(c);
 }
}
class MethodOverload
{
 public static void main(String s[])
 {
  MethodOverloading p=new MethodOverloading();
//   int a,b,c;
//   double k,m,n;
  p.add(10,20);
  p.add(10.1,20.4);
  p.add(10,20,30);
  p.add(2,3.0);
  p.add(2.5,3.7);
 }
}