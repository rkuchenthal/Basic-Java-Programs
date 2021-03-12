//Kuchenthal ryan
//user inputs new userid and we check with ifelse to very its within our perameters

import java.util.*;


public class IfElsePasswordReader
{
   public static void main( String [] args )
        
    {
      
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter a Username that is between 6 & 10 characters long ");
  System.out.println("Enter Username here: ");
  String userName = scan.next();
  
  int userLen = userName.length();
  
  if(userLen >= 6 && userLen <=10)
 {
  System.out.println("Welcome " + userName);
  }
   else
 {
  System.out.println("User ID not valid");
  }
 
  }
}