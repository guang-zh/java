import java.util.Scanner;
public class Rectangle{
  public static void main(String[] args){
   Scanner reader=new Scanner(System.in);
   System.out.println("Length: ");
   double Length=reader.nextInt();
   System.out.println("Width: ");
   double Width=reader.nextInt();
   if (Length > 0 && Width >0){
   double Area;
   double Perimeter;
   Area=Length*Width;
   Perimeter=(Length+Width)*2;
   System.out.println("The area of the rectangle is "+ Area + " and the perimeter is " + Perimeter);
   }else{
     System.out.println("Length and Width need to be positive numbers!");
   }
  }
}