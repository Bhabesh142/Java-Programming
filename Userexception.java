import java.util.*;
class Userexception extends Exception
{
  Userexception(String s)
  {
   super(s);
  }
}
class Demoexception
{
 static void validate(int age) throws Userexception
 {
  if(age<18)
  {
   throw new Userexception("You cannot vote.");
  }
  else
  {
   throw new Userexception("You can vote.");
  }
 }
 public static void main(String s[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Ent your age: ");
  int a=sc.nextInt();
  sc.close();
  try
  {
   validate(a);
  }
  catch(Userexception e)
  {
   System.out.println(e);
  }
 }
}