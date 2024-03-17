import java.util.*;
class SingleinhrtSC
{
 double sal;
 void bonus()
 {
  double bonus=(0.20*sal);
  double total=sal+bonus;
  System.out.println("Programmer's Bonus is: " + bonus);
  System.out.println("Programmer's Salary is: " + total);
 }
}
class Salary extends SingleinhrtSC
{
 void salcal()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Ent current salary: ");
  sal=sc.nextDouble();
  sc.close();
  bonus();
 }
}
class Sal
{
 public static void main(String s[])
 {
  Salary s1=new Salary();
  s1.salcal();
 }
}