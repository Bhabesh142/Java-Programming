import java.util.*;
class FactorialSC
{
 public static void main(String a[])
 {
  Scanner sc = new Scanner(System.in);
  int i,num,fact=1;
  System.out.print(" Enter a num: ");
  num= sc.nextInt();
  sc.close();

  for(i=1;i<=num;i++)
  {
   fact=fact*i;
  }
  System.out.println("Factorial of " + num + " is:" + fact);
 }
}