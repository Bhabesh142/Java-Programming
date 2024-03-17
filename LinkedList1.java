import java.util.*;  
class LinkedList1
{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> al=new LinkedList<String>();
        System.out.println("Enter strings (enter 'exit' to finish):");
        String input = sc.nextLine();

        while(!input.equalsIgnoreCase("exit"))
        {
            al.add(input);
            input = sc.nextLine();
        }

        Iterator<String> itr = al.iterator();
        System.out.println("Elements in the list:");

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        sc.close();
    }
}
// public class LinkedList1
// {  
// public static void main(String args[])
// {  
// LinkedList<String> al=new LinkedList<String>();  
// al.add("Ravi");  
// al.add("Vijay");  
// al.add("Ravi");  
// al.add("Ajay");  
// Iterator<String> itr=al.iterator();  
// while(itr.hasNext())
// {  
// System.out.println(itr.next());  
// }  
// }  
// }  