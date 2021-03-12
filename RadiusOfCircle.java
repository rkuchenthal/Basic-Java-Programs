//Kuchenthal Ryan


import java.util.Scanner;
import java.text.NumberFormat;

public class RadiusOfCircle
{
   public static void main( String [] args ) 
   
    {
        
        
       
        double area;
        
        
        Scanner scan = new Scanner( System.in );
       
       NumberFormat decimal =NumberFormat.getNumberInstance(); 
        
        System.out.println("Enter Radius of circle whith decimal included: ");
        double radius = scan.nextDouble ();
        
        
        area = Math.PI *radius*radius;
        System.out.println( "The area of the circle is " + area);
 
        
       double circumference = 2*Math.PI*radius;
        System.out.println( "The circumference of the circle is " + decimal.format(circumference));
 
 
    }
}