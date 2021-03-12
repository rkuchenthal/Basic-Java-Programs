//Kuchenthal, Ryan


import java.util.*;


public class PasswordReader
{
   public static void main( String [] args )
        
    {
      
  Scanner scan = new Scanner(System.in);
    
      System.out.print("Enter your first password here: ");
      String pass1 = scan.next();
      
      System.out.print("Enter your first password here: ");
      String pass2 = scan.next();
     
      int lengthpass1 = pass1.length();
      int lengthpass2 = pass2.length();
      
      Integer smaller = Math.min(lengthpass1, lengthpass2);
      System.out.println( "There are " + smaller + " letters in the smaller word of your password.");
            

     

    }
}
//need to finish 50, and do 55