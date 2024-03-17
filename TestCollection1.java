import java.util.*;
 
public class TestCollection1
{
 
   public static void main(String[] args)
   {
      ArrayList<Double> numbers = new ArrayList<Double>();
 
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a list of numbers: ");
       
      while (in.hasNextDouble())
      {
         double input = in.nextDouble();
         numbers.add(input);
      }
 
      if (numbers.size() == 0)
      {
         System.out.println("No average.");
 
      } 
       
      else
      {
         double total = 0;
         for (double element : numbers)
         {
            total = total + element;
         }
         double average = total / numbers.size();
         System.out.println("The average is: " + average);
 
      }
      in.close();
   }
}
