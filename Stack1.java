import java .util.*;
class Stack1
{
    public static void main(String s[])
    {
        Stack<String> stack = new Stack<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add stack data (enter 'exit' to finish):");
        String input = sc.nextLine();

        while(!input.equalsIgnoreCase("exit"))
        {
            stack.push(input);
            input = sc.nextLine();
        }
        
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) 
        {
            System.out.println(stack.pop()); // Printing the popped element
        }
        sc.close();
    }
}