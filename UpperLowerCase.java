//Kuchenthal, Ryan
//change user input string to upper and lower case and print them out

import java.util.Scanner;

public class UpperLowerCase
{
   public static void main( String [] args )
        
    {
      
  Scanner scan = new Scanner(System.in);
   
   System.out.print("Type here: ");
    
    String word = scan.next();
    
    System.out.print("\n" + word.toUpperCase() + "\n" + word.toLowerCase() + "\n" + word);
    
    }
}