class A
{
 int rno;
 void setrno(int a)
 {
  rno=a;
 }
 void show()
 {
  System.out.println("rno is "+rno);
 }
}
class B extends A
{
 int s1;
 void setmarks(int x)
 {
  s1=x;
 }
 void show1()
 {
  System.out.println("subject marks "+s1);
 }
}
class C extends A
{
 int l1;
 void getlab(int y)
 {
  l1=y;
 }
 void show2()
 {
  System.out.println("lab marks are "+l1);
 }
}
class hirarc
{
 public static void main(String args[])
 {
  B b=new B();
  b.setrno(83);
  b.setmarks(40);
  C c=new C();
  c.getlab(50);
  b.show();
  b.show1();
  c.show2();
 }
}