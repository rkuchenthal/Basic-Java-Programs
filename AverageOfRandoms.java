//Kuchenthal Ryan
//create 3 random numbers and sum them together then print result
import java.util.Random;
import java.text.NumberFormat;

public class AverageOfRandoms
{
   public static void main( String [] args )
   {
        NumberFormat decimal = NumberFormat.getNumberInstance();
                
         Random a = new Random();
         int n1 = a.nextInt(51);
         
         Random b = new Random();
         int n2 = b.nextInt(51);
         
         Random c = new Random();
         int n3 = c.nextInt(51);
         
         double average = (double) (n1 + n2 + n3)/3;
         
         System.out.println("The 3 random numbers are: " + n1 + " , " + n2 + " , and " + n3 );
         System.out.println("The average of all 3 is: " + decimal.format(average));
    }
 }