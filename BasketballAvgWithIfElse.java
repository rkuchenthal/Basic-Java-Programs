//find if a basketball player will be an allstar based on made shots avg
// and then find their er
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class BasketballAvgWithIfElse

{
   public static void main( String [] args )
   
   {
   
   //DecimalFormat prec = new DecimalFormat ( "0.000" );
   
      Scanner scan = new Scanner( System.in);
   
      System.out.print( "Enter number of shots made > "); 
   
      int num1 = scan.nextInt ();
   
      System.out.print( "Enter number shots taken > ");
   
      int num2 = scan.nextInt ();
   
      double avg = (double) num1 / num2;
      
      String era = NumberFormat.getInstance().format(avg);
      
      double trueEra = Double.parseDouble ( era);
      
         if ( trueEra >= 0.400)
         {System.out.println ("Congrats you are All Star Bound");
         }
         else 
         {System.out.println ("Better Luck Next Time");
           }     
      
     
   //System.out.println (era);
   //System.out.println ( "average shots made" + avg );
   System.out.println ("You have a " + trueEra + " Era");
   
   }
   
   
}   