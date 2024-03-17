import java.util.*;
class StringarraySC
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Ent the array size: ");
  int a=sc.nextInt();
  sc.close();
  String[] str=new String[a];  
  System.out.print("Enter the string: ");
  for(int i=0;i<str.length;i++)
  {
   str[i]=sc.nextLine();
  }
  for(int i=0;i<str.length;i++)
  {
  System.out.println(str[i]);
  }
}
}