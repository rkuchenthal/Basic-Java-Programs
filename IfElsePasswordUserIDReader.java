//Kuchenthal ryan 
//verify a user inputed username and pass 


import java.util.*;


public class IfElsePasswordUserIDReader
{
   public static void main( String [] args )     
    {
  final  String  user_ID     = "admin";
  final  String  password    = "open";
   
     
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter Username here: ");
  String user = scan.next();
  
  System.out.println("Enter Password here: ");
  String pass = scan.next();
 

if(user_ID.equals(user))
     {
          if (password.equals(pass))
               System.out.println("Welcome");
           else
              System.out.println("invalid password");
       }
else if(password.equals(pass))
       {
         if(user_ID.equals(user))
             System.out.println("Welcome");
         else 
            System.out.println("User ID not valid");
       }
else 
   System.out.println("User ID and password not valid");
  }
}