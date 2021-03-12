//Kuchenthal, Ryan

import java.util.Random;

 public class RandomIntegers
 
   { 
      public static void main(String [] args)
      
      {
        Random a = new Random();
         int n1 = a.nextInt(101);
         
        Random b = new Random();
         int n2 = b.nextInt(101);
         
         System.out.print("The first number is " + n1 + " and the second number is " + n2 + ".");
         System.out.print("\nThe smaller of the two is " + Math.min(n1, n2) + ".");
         
         
            
        }
    }