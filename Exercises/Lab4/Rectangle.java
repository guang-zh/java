public class Rectangle{
  public static void main(String[] args){
   double length;
   length=10.5;
   double width;
   width=20;
   if (length > 0 && width >0){
   double Area;
   double Perimeter;
   Area=length*width;
   Perimeter=(length+width)*2;
   System.out.println("The area of the rectangle is "+ Area + " and the perimeter is " + Perimeter);
   }else{
     System.out.println("Length and Width need to be positive numbers!");
   }
  }
}