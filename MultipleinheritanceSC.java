import java.util.*;
class Student
{
 int roll;
 void getroll(int r)
 {
  roll=r;
 }
 void disproll()
 {
  System.out.println("Roll is: " + roll);
 }
}
class test extends Student
{
 int m1,m2;
 void getmarks(int a,int b)
 {
  m1=a;
  m2=b;
 }
 void dispmarks()
 {
  System.out.println("Marks are: " + m1 + " " + m2);
 }
}
interface smark
{
 int sm=15;
 void dispsports();
}
class finaldata extends test implements smark
{
 int fm;
 public void dispsports()
 {
  System.out.println("Sports: " + sm);
 }
 void finalmarks()
 {
  disproll();
  dispmarks();
  dispsports();
 
  fm=m1+m2+sm;
  System.out.println("Final mark is: " + fm);
 }
}
class Studentinfo
{
 public static void main(String s[])
 {
   Scanner sc=new Scanner(System.in);
   int r,a,b;
   System.out.print("Ent roll: ");
   r=sc.nextInt();
   System.out.print("Ent m1 & m2: ");
   a=sc.nextInt();
   b=sc.nextInt();
   finaldata fd=new finaldata(); 
   fd.getroll(r);
   fd.getmarks(a,b);
   fd.finalmarks();
   sc.close();
 }
}