import java.util.*;
class inheritance
{
    float marks;
    void data()
    {
        float math = (0.5f*marks);
        float total = marks + math;
        System.out.println("Smita's math marks is:- " + math);
        System.out.println("Smita's marks is: " + total);
    }
}
class smita extends inheritance
{
    void smitacalculation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter smita's marks: ");
        marks = sc.nextFloat();
        data();
        sc.close();
    }
}
class smita1
{
    public static void main(String a[])
    {
        smita s1 = new smita();
        s1.smitacalculation();
    }
}