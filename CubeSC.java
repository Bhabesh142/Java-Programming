import java.util.*;
class CubeSC
{
 void cube(int a)
 {
  int num=a*a*a;
  System.out.println("Cube of "+ a +" is: " + num);
 }
}
class Cube
{
 public static void main(String s[])
 {
  try (Scanner sc = new Scanner(System.in)) {
    int data;
      System.out.print("Ent num: ");
      data=sc.nextInt();
      new CubeSC().cube(data);
}
 }
}