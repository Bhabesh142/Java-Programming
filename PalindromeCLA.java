class PalindromeCLA
{
 public static void main(String s[])
 {
  int n,sum=0,temp;
  int num=Integer.parseInt(s[0]);
  temp=num;
  
  while(temp!=0)
  {
   n=temp%10;
   sum=sum*10+n;
   temp=temp/10;
  }
 if(sum==num)
 { 
  System.out.println(num + " number is palindrome.");
 }
 else
 {
  System.out.println(num + " number is not palindrome.");
 }
}
}
 