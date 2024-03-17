import java.util.Scanner;
interface area
{
    int area(int a,int b);
}
class rectangle
{
    int area(int a, int b)
    {
        return(a*b);
    }
}
class triangle
{
    int area(int a, int b)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle: ");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		System.out.println("Enter base and height of triangle: ");
		int base=sc.nextInt();
		int height=sc.nextInt();
                data rect = new data();
                data1 tri = new data1();
                area subhangee;
                subhangee = rect;
                System.out.println("Area of rectangle: " + subhangee.area(length,breadth));
                subhangee = tri;
                System.out.println("Area of triangle: " + subhangee.area(base,height));
                sc.close();
    }
}