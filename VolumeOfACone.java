//determine the volume of a cone
import java.util.Scanner;
import java.text.DecimalFormat;

public class VolumeOfACone
{
   public static void main( String [] args ) 
   
    {
        
        
        double v;
        
        
        Scanner scan = new Scanner( System.in );
       
        DecimalFormat decimal = new DecimalFormat("##############0.#"); 
        
        System.out.println("Enter Radius of Cone whith decimal included: ");
        double r = scan.nextDouble ();
        
        System.out.println("Enter Height of Cone whith decimal included: ");
        double h = scan.nextDouble ();
        
        v = Math.PI*Math.pow(h,2)*(h/3);
        
       
        System.out.println( "The Volume of the circle is " + decimal.format(v));
 
 
    }
  }