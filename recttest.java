class recttest
{
 int l,b; 
 recttest(int len,int bre)
 {
  l=len;
  b=bre;
 }
 int area()
 {
  return l*b;
 }
}
class calculus
{
 public static void main(String s[])
 {
  recttest r=new recttest(5,6);
  System.out.println("Rect area is: " + r.area());
 }
}