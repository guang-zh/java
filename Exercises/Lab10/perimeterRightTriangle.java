import java.util.Scanner;
public class perimeterRightTriangle{
  public static void main(String[] args){
    Scanner reader=new Scanner(System.in);
    System.out.println("One side: ");
    double side1=reader.nextDouble();
    System.out.println("Other side: ");
    double side2=reader.nextDouble();
    if (side1>0 & side2>0){
     double side3 = Math.sqrt(side1*side1+side2*side2);
     double PerimeterTriangle=side1+side2+side3;
     System.out.println("The perimeter of the right triangle is " + PerimeterTriangle);
    }else{
       System.out.println("Invalid");
     }
  }
}