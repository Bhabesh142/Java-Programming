class ArmstrongCLA
{
 public static void main(String a[])
 {
  int num,r,sum=0;
  int temp=Integer.parseInt(a[0]);
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
   System.out.println(num + "is not an Armstrong number.");
  }
 }
}