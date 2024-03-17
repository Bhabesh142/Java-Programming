import java.util.*;
class UserInputUntilDataStopSC
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String a[]=new String[100];
  String s; 
  int i=0,j;
  sc.close();
   
  do
  { 
   System.out.println("Ent a value: ");
   s=sc.nextLine();
   a[i]=s;
   i++;
  }
   while(!s.equals("No"));
   System.out.println("Entered values are: ");
   
   for(j=0;j<i-1;j++)
   {
    System.out.println(a[j]+" ");
   }
  }
}