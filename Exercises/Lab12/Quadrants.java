public class Quadrants{
  public static void main(String[] args){
   java.util.Scanner reader=new java.util.Scanner(System.in);
   
   System.out.println("Input x: ");
   double x=reader.nextDouble();
   System.out.println("Input y: ");
   double y=reader.nextDouble();
   
   if (x>0 && y>0){
         System.out.println("1st quadrant");
         }
      else if (x<0 && y>0){
           System.out.println("2nd quadrant");
           }
      else if (x<0 && y<0) {
          System.out.println("3rd quadrant");
          }
      else if (x>0 && y<0) {
          System.out.println ("4th quadrant"); 
          }     
      else{
       System.out.println("origin"); 
      }
      }
}