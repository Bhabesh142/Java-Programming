import java.util.*;
class Addition
{
 public static void main(String a[])
 {
  try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter a no:- ");
      int n1 = sc.nextInt();
      System.out.println("Enter another no:- ");
      int n2 = sc.nextInt();
      int sum = n1+n2;
      System.out.println("The sum is: " + sum);
}
 }
}