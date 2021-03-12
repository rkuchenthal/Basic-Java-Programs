//Kuchenthal, Ryan
//determine if user given email is a student/teacher and if so say it is.

import java.util.*;


public class EmailReader
{
   public static void main( String [] args )
        
    {
      
  Scanner scan = new Scanner(System.in);
    
      System.out.print("Enter your Email here: ");
      String email = scan.next();
      
    boolean mail = email.contains("@");
    boolean edu = email.contains(".edu");
 
    
     if ( mail&& edu)
       System.out.println("It is a student Email.");
      
     else
       System.out.println("Not valid Email.");

     

    }
}
//need to use substring of @,