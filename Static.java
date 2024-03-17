class Static
{
 int roll;
 String name;
 static String clg="CPGS";
 Static(int roll,String name)
 {
  this.roll=roll;
  this.name=name;
 }
 void dispinfo()
 {
  System.out.println("Roll: " + roll + " Name: " + name + " " + "College name: " + clg);
 }
}
class Demostatic
{
 public static void main(String s[])
 {
  Static s1=new Static(1,"Ram");
  Static s2=new Static(2,"Hari");
  s1.dispinfo();
  s2.dispinfo();
 }
}
