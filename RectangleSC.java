import java.util.*;
class RectangleSC
{
 int l,b;
 void area(int l,int b)
 {
  int area=l*b;
  System.out.println("Area of rectangle is: " + area);
 }
}
class Rectangle
{
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  RectangleSC a=new RectangleSC();
  int l,b;
  System.out.println("Ent l & b: ");
  l=sc.nextInt();
  b=sc.nextInt();
  a.area(l,b);
  sc.close();
 }
}
  