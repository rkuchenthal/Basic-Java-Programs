/* Chapter 3 Programming Activity 2
  
*/

// ***** add your import statements here
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;


public class PracticeMethods
{
  public static void main( String [] args )
  {
    //*****
    // 1.  a. Create a Scanner object to read from the console
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    
    
    Scanner scan = new Scanner(System.in);
    
      System.out.print("Enter your first name: ");
    
      String firstName = scan.next();
      System.out.println("Hello " + firstName);
      System.out.println( "There are " + firstName.length()+ " letters in your name.");
    //*****
    // 2.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Calculate and print the age the user will be this year.
    //     c. Declare a constant for average life expectancy,
    //            set its value to 77.9
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage
   
      
       System.out.print("\nEnter your birth year: ");
      int birthYear = scan.nextInt();
      int age =2017 - birthYear;
       System.out.println("You are " + age + " years old");
      final double LIFE_SPAN = 77.9;
      DecimalFormat percent = new DecimalFormat( "#0.0%");
       System.out.println("You have lived " + percent.format(age/LIFE_SPAN) + "of your life.");
    //*****
    // 3.  a. Generate a random integer between 1 and 20
    //     b. Pop up an input dialog box and ask the user for a guess.
    //     c. Pop up an output dialog box telling the user the number
    //         and how far from the number the guess was (hint: use Math.abs)
   Random rand = new Random ();
       int number= rand.nextInt(20)+1;
       String temp = JOptionPane.showInputDialog(null, "Enter your guess");
       int guess = Integer.parseInt(temp);
       JOptionPane.showMessageDialog1(null, "your answer was " + Math.abs (guess-number) +" away.");
  }
}