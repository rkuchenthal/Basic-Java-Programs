/* Kuchenthal Ryan 
 use a basic dialog box in the terminal using user input
*/


import java.util.Scanner;


public class DialogBoxDemo1
{
  public static void main( String [] args )
  {
    Scanner scan = new Scanner(System.in);
  
    System.out.print("Enter your full name > ");
    String fullName = scan.nextLine();
    
    int indexOfSpace = fullName.indexOf(' ');
    String firstName = fullName.substring(0, indexOfSpace);
                
    System.out.print("The full name is " + fullName);
    System.out.println(" The first name is " + firstName);
 
 
  }
}