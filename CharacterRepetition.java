import java.util.Scanner;
class NumberCount
{
    public static void main(String a[])
    {
        String s;
        char ch;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ent a sentence: ");
        String str = sc.nextLine();

        System.out.println("Ent a data to be searched: ");
        s = sc.nextLine();
        char c = s.charAt(0);

        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(ch == c)
            {
                count++;
            }
        }
        System.out.println("Character " + c+ "occur" + count + "times");
        sc.close();
    }
}