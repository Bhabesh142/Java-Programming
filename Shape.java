import java.util.*;
class Shape
{
 void area()
 {
  System.out.println("Shape area");
 }
}
class triangle extends Shape
{
 float br,h;
 void area2()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Ent br & h: ");
  br=sc.nextFloat();
  h=sc.nextFloat();
  sc.close();

  float area2=(br*h)/2;
  System.out.println("Area of triangle is: " + area2);
 }
}
class rectangle extends Shape
{
 int l,b;
 void area3()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Ent l & b: ");
  l=sc.nextInt();
  b=sc.nextInt();
  sc.close();
  int area3=(l*b);
  System.out.println("Area of rectangle is: " + area3);
 }
}
class Methodoverriding
{
 public static void main(String s[])
 {
  triangle tr=new triangle();
  rectangle rc=new rectangle();
  tr.area2();
  rc.area3();
}
}