//Kuchenthal Ryan 
//check if given year, inputed by user, is or was a leap year.
import java.util.Scanner;

public class LeapYearChecker
{
   public static void main(String [] args)
   {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter year to determine if it is aleap year or not > ");
   String entry = scan.next();
   
   int year = Integer.parseInt( entry );
   
   int a = year%4;
   int b = year%100;
   int c = year%400;
   
 if  (a==0 && b!=0 || c==0)
  
   {
   System.out.println( year + " is a leap year");
   }
   
 else

   {
   System.out.println( year + " is not a leap year");
   }
   
   }
}