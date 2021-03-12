//Calculating the are of a circle with a hardcoded radius

public class AreaofCircle
{
   public static void main( String [] args ) 
   
    {
        final double PI = 3.14159;
        
        double radius;
        double area;
        
        radius=71;
        
        area = PI *radius*radius;
        System.out.println( "The area of the circle is " + area);
    }
}