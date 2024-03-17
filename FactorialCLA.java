class FactorialCLA
{
 public static void main(String a[])
 {
  int i,fact=1;
  int num=Integer.parseInt(a[0]);
 
  for(i=1;i<=num;i++)
  {
   fact=fact*i;
  }
  System.out.println("Factorial of " + num + "is:" + fact);
 }
}