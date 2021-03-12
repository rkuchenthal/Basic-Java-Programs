//Kuchenthal, Ryan
//given a domain name add www. and .com to it then display web address

import java.util.Scanner;

public class DomainName
{
   public static void main( String [] args )
        
    {
      
  Scanner scan = new Scanner(System.in);
    
      System.out.print("Enter your Domain Name here: ");
    
      String d1 = scan.next();
           
      System.out.println( "www." + d1 + ".com is now your Daomain Name.");
            

      

    }
}