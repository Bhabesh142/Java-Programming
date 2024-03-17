import java.util.*;
class HierarchicalSC
{
 int num1,num2;
 void add()
 {
  int add;
  Scanner sc=new Scanner(System.in);
  System.out.print("Ent num1: ");
  int num1=sc.nextInt();
  System.out.print("Ent num2: ");
  int num2=sc.nextInt();
  add=num1+num2;
  System.out.print("Addition is: " + add + "\n");
  sc.close();
 }
}
class Math1 extends HierarchicalSC
{
 int num1,num2;
 void mul()
 {
  int multi;
  Scanner sc=new Scanner(System.in);
  System.out.print("Ent num1: ");
  int num1=sc.nextInt();
  System.out.print("Ent num2: ");
  int num2=sc.nextInt();
  multi=num1*num2;
  System.out.print("Multiply is: " + multi + "\n");
  sc.close();
 }
}
class Math2 extends HierarchicalSC
{
 int num1,num2;
 void sub()
 {
  int subtrct;
  Scanner sc=new Scanner(System.in);
  System.out.print("Ent num1: ");
  int num1=sc.nextInt();
  System.out.print("Ent num2: ");
  int num2=sc.nextInt();
  subtrct=num1-num2;
  System.out.print("Subtraction is: " + subtrct + "\n");
  sc.close();
 }
}
class Math
{
 public static void main(String s[])
 {
  HierarchicalSC obj=new HierarchicalSC();
  obj.add();
  Math1 obj1=new Math1();
  obj1.mul();
  Math2 obj2=new Math2();
  obj2.sub();
 }
}