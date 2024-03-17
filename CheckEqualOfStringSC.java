import java.util.*;
class CheckEqualOfStringSC
{
 public static void main(String a[])
 {
  try (Scanner sc = new Scanner(System.in)) {
    String str1,str2;
      System.out.print("Ent first string: ");
      str1=sc.nextLine();
      System.out.print("Ent second string: ");
      str2=sc.nextLine();
      
      if(str1.equals(str2))
      {
       System.out.println("Both strings are equal.");
      }
      else
      {
       System.out.println("Both strings are unequal.");
      }
}
 }
}