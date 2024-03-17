import java.util.*;
interface area
{
    int area();
}
class rectangle
{
    public int area(int a, int b)
    {
        return(a*b);
    }
}
class triangle
{
    public int area(int a, int b)
    {
        return(a*b/2);
    }
}
class data extends rectangle implements area
{
    public int area(int a, int b)
    {
        return(a*b);
    }
}
class data1 extends triangle implements area
{
    public int area(int a, int b)
    {
        return(a*b/2);
    }
}

class areatotal
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        data rect = new data();
        data1 tri = new data1();
        area subhangee;
        subhangee = rect;
        subhangee = tri;
        System.out.println("Enter a & b: ");
        a=sc.nextInt();
        b=sc.nextInt();
    }
}