abstract class show
{
 abstract void show1();
 void show2()
 {
  System.out.println("It is a concrete method.");
 }
}
class derived extends show
{
 void show1()
 {
  System.out.println("It is an abstract method.");
 }
}
class Demoabstract
{
 public static void main(String s[])
 {
  derived d=new derived();
  d.show1();
  d.show2();
 }
}