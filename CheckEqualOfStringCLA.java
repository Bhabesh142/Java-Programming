class CheckEqualOfStringCLA
{
 public static void main(String ar[])
 {
  int arLength=ar.length;
  if(arLength==2)
  {
  String s1=ar[0];
  String s2=ar[1];

  if(s1.equals(s2))
  {
   System.out.println("Both strings are equal.");
  }
  else
  {
   System.out.println("Both strings are unequal.");
  }
 }
}
}