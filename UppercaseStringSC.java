import java.util.*;
class UppercaseStringSC
{
 public static void main(String a[])
 {
  Scanner sc=new Scanner(System.in);
  String str;
  System.out.print("Ent a string: ");
  str=sc.nextLine();
  System.out.println("Uppercase is: " + str.toUpperCase());
  
  System.out.println("Length of string: " + str.length());
  sc.close();
 }
}
