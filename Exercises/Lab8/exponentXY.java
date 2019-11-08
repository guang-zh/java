public class exponentXY{
  public static void main(String[] args){
   java.util.Scanner reader= new java.util.Scanner(System.in);
   System.out.println("Input x value: ");
   double x=reader.nextDouble();
   System.out.println("Input y value: ");
   double y=reader.nextDouble();
   double z = Math.pow(x,y);
   System.out.println("Base x of exponent y: " + z);
  }
}