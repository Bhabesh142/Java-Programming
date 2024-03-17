import java.util.*;
class Multiplecatch
{
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  int[] a=new int[3];
  System.out.print("Enter array elements of a: ");
  int b=sc.nextInt();
  System.out.println("Ent value of b: ");
  sc.close();

  try
   {
    for(int i=0;i<a.length;i++)
    {
     a[i]=sc.nextInt();
    }
     int c=a[4]/b;
     System.out.println("Value of c: " + c);
   }
   catch(ArithmeticException e)
   {
    System.out.println("Arithmetic exception has occurred");
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("ArrayIndexOutOfBoundsException has occurred");
   }
   catch(Exception e)
   {
    System.out.println("Commonexception has occurred");
   }
 }
}