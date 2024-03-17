class Testcatch
{
 public static void main(String s[])
 {
  try
  {
     int a[]={1,2,3,4,5};
     int b=5;
     int c=a[4]/b;
     System.out.println("Value of b: " + b);
     System.out.println("Value of c: " + c);
   }
   catch(ArithmeticException e)
   {
    System.out.println("Arithmetic exception has occurred");
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("ArrayIndexOutOfBoundsException has occurred");
   }
   catch(Exception e)
   {
    System.out.println("Commonexception has occurred");
   }
 }
}