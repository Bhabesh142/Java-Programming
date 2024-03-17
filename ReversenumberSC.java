import java.util.*;
class ReversenumberSC
{
 public static void main(String a[])
 {
  Scanner sc=new Scanner(System.in);
  int num,reverse=0;
  System.out.print("Ent num to be revrsd: ");
  num=sc.nextInt();
  sc.close();

  while(num!=0)
  { 
   reverse=reverse*10;
   reverse=reverse+num%10;
   num=num/10;
  }
   System.out.print("Reverse of number is: " + reverse);
 }
}

