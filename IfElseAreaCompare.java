//kuchenthal ryan
//compare areas of shapes to determine if equal or which is larger using if/else statements

public class IfElseAreaCompare
{
   public static void main(String [] args)
   {
   float squareSide = .666666667f;
   float rectSide1  = .1111111111111111f;
   float rectSide2  = 4f;
   
   float area1 = squareSide * squareSide;
   float area2 = rectSide1 * rectSide2;
   
   if(area1 == area2)
      {
      System.out.println("The areas of the square and rectangle are equal.");
      }
   else if ( area1 > area2)
      {
      System.out.println("The square has the larger of the two areas.");
      }
   else
      {
      System.out.println("The rectangle has the larger of the two areas.");
      }
   }
}
