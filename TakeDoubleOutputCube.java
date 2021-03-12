//Kuchenthal, Ryan
//takes a double given by user and returns its cube

import java.lang.*;
import java.util.Scanner;

public class TakeDoubleOutputCube
{
   public static void main( String [] args )
      {
      
     Scanner scan = new Scanner(System.in);
     
      System.out.print("Enter number to be cubed: ");
      
      String n1 = scan.next();
      double n2 = Double.parseDouble(n1);
      double n3 = Math.pow( n2, 3);
      
      System.out.print(n1 + "cubed is " + n3 + ".");
      
      
          
      }
}
        