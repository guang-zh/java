public class CalcPerimeters{
  public static void main(String[] args){
  java.util.Scanner reader=new java.util.Scanner(System.in);
  System.out.println("Enter a value:");
  double parameter=reader.nextDouble();
  System.out.println("The perimeter of a square of side " + parameter + " is: "+ perimeterSquare(parameter));
  System.out.println("The perimeter of a regular pentagon of side " + parameter + " is: "+ perimeterPentagon(parameter));
  System.out.println("The perimeter of a regular hexagon of side " + parameter + " is: "+ perimeterHexagon(parameter));
  System.out.println("The perimeter of a regular octagon of side " + parameter + " is: "+ perimeterOctagon(parameter));
  }
  public static double perimeterSquare(double x){
   double square_p=x*4;
   return square_p;
  }
   public static double perimeterPentagon(double x){
   double penta_p=x*5;
   return penta_p;
   }
   public static double perimeterHexagon(double x){
   double hexa_p=x*6;
   return hexa_p;
   }
   public static double perimeterOctagon(double x){
   double octa_p=x*8;
   return octa_p;
   }
}