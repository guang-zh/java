public class Quadratic{
  public static void main(String[] args){
   java.util.Scanner reader= new java.util.Scanner(System.in);
   System.out.println("Input a: ");
   double a = reader.nextDouble();
   System.out.println("Input b: ");
   double b = reader.nextDouble();
   System.out.println("Input c: ");
   double c = reader.nextDouble();
   
   if (b*b-4*a*c > 0 && a !=0){
    double realroot1= (-b + Math.sqrt(b*b-4*a*c))/(2*a);
    double realroot2= (-b - Math.sqrt(b*b-4*a*c))/(2*a);
    System.out.println("Real roots are: " + realroot1 + " and " + realroot2);
   }
   else if (b*b-4*a*c==0){
    double realroot=(-b)/(2*a);
    System.out.println("Real root is: " + realroot);
   }
   else {
    System.out.println ("No real roots"); 
   }
  }
}