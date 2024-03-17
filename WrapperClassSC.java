import java.util.*;
class WrapperClassSC
{  
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  new WrapperClassSC();
  int a;
  System.out.println("Ent value of a: ");
  a=sc.nextInt();
  Integer i=Integer.valueOf(a);
  System.out.println(i);
  char b;
  System.out.println("Ent value of b: ");
  b=sc.next().charAt(0);
  Character j=Character.valueOf(b);
  System.out.println(j);
  float c;
  System.out.println("Ent value of c: ");
  c=sc.nextFloat();
  Float k=Float.valueOf(c);
  System.out.println(k);
  double d;
  System.out.println("Ent value of d: ");
  d=sc.nextDouble();
  Double l=Double.valueOf(d);
  System.out.println(l);
  short e;
  System.out.println("Ent value of e: ");
  e=sc.nextShort();
  Short m=Short.valueOf(e);
  System.out.println(m);
  sc.close();
 }
}