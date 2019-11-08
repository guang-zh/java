public class RectangleStatsCalculator{
  public static void main(String[] args){
   java.util.Scanner reader=new java.util.Scanner(System.in);
   System.out.println("Input base: ");
   double base=reader.nextDouble();
   System.out.println("Input height: ");
   double height=reader.nextDouble();
   
   if (base>0 && height>0){
       double area=areaRectangle(base, height);
       double perimeter=perimeterRectangle(base, height);
       double diagonal=findDiagonal(base, height);
       System.out.println("Area is: " + area);
       System.out.println("Perimeter is: " + perimeter);
       System.out.println("Diagonal is: " + diagonal);
     }
     else if (base <= 0 && height>0) {
      System.out.println("invalid base (width)"); 
     }
   else if (base>0 && height<=0){
       System.out.println("invalid height (length)");
     }
   else {
     System.out.println("invalid base and height");
   }
  }
   public static double perimeterRectangle(double side1, double side2){
   double side3= Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
   double perimeter=side1 + side2 + side3;
   return perimeter;                        
  }
  public static double areaRectangle(double side1, double side2){
   double area=(side1*side2)/2;
   return area;
  }
  public static double findDiagonal(double side1, double side2){
   double side3= Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
   return side3;                        
  }

}
