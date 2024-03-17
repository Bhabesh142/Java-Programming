import java.util.*;
class CalcSC
{
    void add(int num1, int num2)
    {
        int res = num1 + num2;
        System.out.println("Addition is: " + res);
    }
    void sub(int num1, int num2)
    {
        int res = num1 - num2;
        System.out.println("Subtraction is: " + res);
    }
    void multiply(int num1, int num2)
    {
        int res = num1 * num2;
        System.out.println("Multiplication is: " + res);
    }
    void div(int num1, int num2)
    {
        int res = num1 / num2;
        System.out.println("Div is: " + res);
    }
}
class Calc
{
 public static void main(String a[])
 {
        int num1, num2;
        CalcSC c=new CalcSC();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        c.add(num1, num2);
        c.sub(num1, num2);
        c.multiply(num1, num2);
        c.div(num1, num2);
 }
}