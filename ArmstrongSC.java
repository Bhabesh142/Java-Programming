import java.util.*;
class ArmstrongSC
{
 public static void main(String a[])
 {
  try (Scanner sc = new Scanner(System.in)) {
    int num,r,temp,sum=0;
      System.out.print("Enter a num: ");
      temp=sc.nextInt();
      num=temp;
      while(temp>0)
      {
       r=temp%10;
       sum=sum+(r*r*r);
       temp=temp/10;
      }
      if(num==sum)
      {
       System.out.println(num + " is Armstrong number.");
      }
      else
      {
       System.out.println(num + " is not an Armstrong number.");
      }
}
 }
} 