class Leapyear
{
 public static void main(String a[])
 {
  int year=2008;
  if(((year%4==0) && (year%100!=0) || (year%400==0)))
  {
   System.out.println(year + " is a leap year.");
  }
  else
  {
   System.out.println(year + " is not a leap year.");
  }
 }
}