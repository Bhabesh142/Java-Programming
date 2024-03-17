import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Who is the inventor of JAVA?");
        int i;
        sc.close();
        
        for(i=0;i<3;i++)
        {
            String a=sc.nextLine();
            if(a.equals("James Gosling"))
            {
                System.out.println("Good your answer is correct.");
                break;
            }
            else
            {
                System.out.println("Try Again your answer is wrong.");
            }
        }
        if(i==3)
        {
            System.out.println("The correct answer is James Gosling.");
        }
    }
}