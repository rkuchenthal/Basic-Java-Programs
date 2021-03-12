// Ryan Kuchenthal
// take the input of different amounts of change then give back a total


import java.util.Scanner;
import java.text.NumberFormat;


public class CentsCounter


{
   public static void main( String [] args )
   
   {
    
      
   Scanner scan = new Scanner( System.in );
   
   System.out.print("Enter the number of quarters: ");
   int quarters = scan.nextInt ();
   System.out.print("Enter the number of dimes: ");
   int dimes = scan.nextInt ();
   System.out.print("Enter the number of nickels: ");
   int nickels = scan.nextInt ();
   
   
   double q2 = quarters *.25;
   double d2 = dimes *.10;
   double n2 = nickels * .05;
   double dollars = q2 + d2 + n2;
 
   NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
  
    System.out.println("The amount is " + priceFormat.format (dollars));
  
   
   
   //DeciamlFormat dollar = new DeciamlFormat("$0.00");
   
   
  // System.out.print (  
   
   }


}