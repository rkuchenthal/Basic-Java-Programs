//Kuchenthal Ryan
//determine volume of sphere
 
import java.util.Scanner;
import java.text.*;

public class VolumeOfASphere
{
   public static void main(String [] args)
   {
   DecimalFormat d3 = new DecimalFormat("#0.000");
   
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the Radius of the circle > ");
   String entry = scan.next();
  
   double radius = Double.parseDouble( entry );
   
   double volume = (4.0)/(3.0)*Math.PI*Math.pow(radius,3);
   
   System.out.println("The volume os the sphere is " + d3.format(volume));
   
   
   }
}