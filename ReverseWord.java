import java.util.Scanner;

class Solution
{
    static String reverseEachWord(String input)
    {
        String arr[] = input.split(" ");
        String result = "";
        
        for(int j=0;j<arr.length;j++)
        {
            for(int i=arr[j].length()-1;i>=0;i--)
            {
                result = result + arr[j].charAt(i);
            }
            result = result + " ";
        }
        return result;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
        sc.close();
    }
}