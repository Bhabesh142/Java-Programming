import java.util.*;
class TestCollection
{
    public static void main(String s[])
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter strings (enter 'exit' to finish):");
        String input = scanner.nextLine();

        while(!input.equalsIgnoreCase("exit"))
        {
            list.add(input);
            input = scanner.nextLine();
        }

        Iterator<String> itr = list.iterator();
        System.out.println("Elements in the list:");

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        scanner.close();
    }
}

// import java.util.*;
// class TestJavaCollectionb {
//     public static void main(String args[]) 
//     {
//         ArrayList<String> list = new ArrayList<String>(); // Creating an ArrayList of Strings
//         Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input
//         // Prompting the user to enter four strings
//         System.out.println("Enter four strings:");
//         for (int i = 0; i < 4; i++) 
//         {
//             String input = scanner.nextLine(); // Reading the input from the user
//             list.add(input); // Adding the input to the list
//         }
//         // Using an Iterator to traverse the list
//         Iterator<String> itr = list.iterator(); // Getting an Iterator object to iterate over the list 
//         // Traversing the list through Iterator
//         System.out.println("Elements in the list:");
//         while (itr.hasNext()) 
//         { // Looping through the list as long as there are elements
//             System.out.println(itr.next()); // Printing the current element and moving the iterator forward
//         }
//         scanner.close();
//     }
// }

// { 
//     public static void main(String s[])
//     {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//         System.out.println("Enter four strings:");
//                 for (int i = 0; i < 4; i++) 
//                 {
//                     String input = sc.nextLine(); // Reading the input from the user
//                     list.add(input); // Adding the input to the list
//                 }
//                 System.out.println("Elements in the list:");
//                         for (String element : list) 
//                         {
//                             System.out.println(element); // Printing each element in the list
//                         }
//     }
// }