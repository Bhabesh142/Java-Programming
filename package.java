import java.util.Scanner;
import mypack.Calculator;

class Demo
{ 
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  Calculator c=new Calculator();
  int x;
  System.out.println("Ent value of x: ");
  x=sc.nextInt();
  c.cube(x);
 }
}