import java.util.*;
class EmployeeSC
{
 int sal,bonus;
 Scanner sc = new Scanner(System.in);
 void salary()
 {
  System.out.print("Ent current sal: ");
  sal=sc.nextInt();
}
class Programmer extends EmployeeSC
{
 double bonus;
 void bonus() 
 {
  bonus=(0.20*sal);
  System.out.println("Pogrammer's Bonus is: " + sal);
  bonus=sc.nextDouble();
 }
  public void main(String s[])
  {
   Programmer obj = new Programmer();
   obj.salary();
   obj.bonus();
  }
}
}