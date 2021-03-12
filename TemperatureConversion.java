/*temperature conversion of hard coded degrees
Kuchenthal, Ryan */

public class TemperatureConversion
{
   public static void main(String [] args)
   {
      final int FREEZING = 32;
      
      int Fahrenheit =76;
      
      double Celsius = (double) 5/9 *(Fahrenheit - FREEZING);
      
      System.out.println(Fahrenheit + " in Fahrenheit is " + Celsius + " in Celsius.");
           
      Fahrenheit = (int) (9D/5 * Celsius + FREEZING);
  
      System.out.println( Celsius + " in Celsius is " + Fahrenheit + " in Fahrenheit.");
  
    }
}