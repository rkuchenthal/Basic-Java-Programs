//use a while loop to find the @ symbol in a string
import java.util.Scanner;

public class WhileLoopDetectingAnATCharacter
{
   public static void main(String [] args) 
    {
   Scanner scan =new Scanner(System.in);
   
    System.out.println("Enter a word with the @ symbol > ");
    String input = scan.next();
    
    while ( !input.contains("@"))
    {
      
      System.out.print("Please enter a word containing @ > ");
      input=scan.next();
    }
    
    System.out.println(input);
    
    
    
    }
}