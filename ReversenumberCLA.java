class ReversenumberCLA
{
 public static void main(String a[])
 {
  int reverse=0;
  int num=Integer.parseInt(a[0]);
  
  while(num!=0)
  { 
   reverse=reverse*10;
   reverse=reverse+num%10;
   num=num/10;
  }
   System.out.print("Reverse of number is: " + reverse);
 }
}


