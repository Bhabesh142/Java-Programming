import java.util.*;
class RectangleTriangleSC
{
 int l,b;
 void area1(int l,int b)
 {
  int area1=l*b;
  System.out.println("Area of rectangle is: " + area1);
 }
 float br,h;
 void area2(float br,float h)
 {
  float area2=(br*h)/2;
  System.out.println("Area of triangle is: " + area2);
 }
}
class RectangleTriangle
{
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  RectangleTriangleSC a=new RectangleTriangleSC();
  int l,b;
  float br,h;
  System.out.println("Ent l & b: ");
  l=sc.nextInt();
  b=sc.nextInt();
  a.area1(l,b);
  System.out.println("Ent br & h: ");
  br=sc.nextFloat();
  h=sc.nextFloat();
  a.area2(br,h);
  sc.close();
 }
}