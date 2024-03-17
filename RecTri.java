import java.util.*;
class RecTri
{
 void area(int l,int b)
 {
  int area=l*b;
  System.out.println("Area of rectangle is: " + area);
 }
 void area(double m,double n)
 {
  double area=(m*n)/2;
  System.out.println("Area of triangle is: " + area);
 }
}
class RecT
{
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  RecTri a=new RecTri();
  int l,b;
  double m,n;
  System.out.println("Ent l & b: ");
  l=sc.nextInt();
  b=sc.nextInt();
  a.area(l,b);
  System.out.println("Ent m & n: ");
  m=sc.nextDouble();
  n=sc.nextDouble();
  a.area(m,n);
  sc.close();
 }
}