import java .util.*;
class Queue1
{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<String> queue = new PriorityQueue<String>();

        System.out.println("Enter queue data (enter 'exit' to finish):");
        String input = sc.nextLine();

        while(!input.equalsIgnoreCase("exit"))
        {
            queue.add(input);
            input = sc.nextLine();
        }

        
        
        sc.close();
    }
}