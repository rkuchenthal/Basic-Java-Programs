import java.util.Scanner;

public class PrimeNumberChecker
{
   public static void main(String [] args)
   {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter a number between 10-100 to calculate if it is prie or not > ");
   String entry = scan.next();
   
   int number = Integer.parseInt( entry );
   
   int a = number%2;
   int b = number%3;
   int c = number%5;
   int d = number%7;

 if (number < 10 || number > 100)
  
   {
   System.out.println( number + " is not a valid entry.");
   }

 else if  (a==0)
  
   {
   System.out.println( number + " is divisible by 2,so it is not a prime number.");
   }
 else if  (b==0)
  
   {
   System.out.println( number + " is divisible by 3,so it is not a prime number.");
   }   
 else if  (c==0)
  
   {
   System.out.println( number + " is divisible by 5,so it is not a prime number.");
   }
 else if  (d==0)
  
   {
   System.out.println( number + " is divisible by 7,so it is not a prime number.");
   }
 else

   {
   System.out.println( number + " is not divisible by 2, 3, 5, or 7, so it is prime.");
   }
   
   }
}