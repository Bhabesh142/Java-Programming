import java.util.*;
class ExceptionSC
{
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  int x,y;
  System.out.println("Ent x: ");
  x=sc.nextInt();
  System.out.println("Ent y: ");
  y=sc.nextInt();

  try
  {
   int z=x/y;
   System.out.println(z);
  }
  catch(ArithmeticException a)
  {
   System.out.println("Value is: " + a);
   System.out.println("Number can't be divided by zero: ");
  }
  sc.close();
 }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       