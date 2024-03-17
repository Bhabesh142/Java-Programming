import java.util.*;
class RectangleConstructorSC
{
 int area,length,breadth;
 RectangleConstructorSC(int l,int b)
 {
  length=l;
  breadth=b;
 }
 void rectArea()
 {
  area=length*breadth;
  System.out.println("Area is: " + area);
 }
 float len,width,perimeter;
 RectangleConstructorSC(float m,float n)
 {
  len=m;
  width=n;
 }
 void rectPerimeter()
 {
  perimeter=2*(len+width);
  System.out.println("Perimeter is: " + perimeter);
 }
}
class RectangleConstructor
{
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  int length,breadth;
  System.out.println("Enter l & b: ");
  length=sc.nextInt();
  breadth=sc.nextInt();
  RectangleConstructorSC obj1=new RectangleConstructorSC(length,breadth);
  obj1.rectArea();
  float len,width;
  System.out.println("Enter m & n: ");
  len=sc.nextFloat();
  width=sc.nextFloat();
  RectangleConstructorSC obj2=new RectangleConstructorSC(len,width);
  obj2.rectPerimeter();
  sc.close();
 }
}