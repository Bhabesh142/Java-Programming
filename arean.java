import java.util.*;
class arean
{
    void rect(float x,float y)
    {
        float rectn=x*y;
        System.out.println("Area of rectangl is: " + rectn);
    }
    void tri(float x,float y)
    {
        float tringl=x*y/2;
        System.out.println("Area of triangle is: " + tringl);
    }
}
class rectri
{
    public static void main(String s[])
    {
        arean ar=new arean();
        Scanner sc = new Scanner(System.in);
            System.out.println("Ent x & y: ");
            float x=sc.nextFloat();
            float y=sc.nextFloat();
            ar.rect(x,y);
            ar.tri(x,y);
            sc.close();
        }
    }