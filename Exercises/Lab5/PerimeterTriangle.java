public class PerimeterTriangle{
  public static void main(String[] args){
    double a=10;
    double b=4;
    if (a>0 & b>0){
     double c = Math.sqrt(a*a+b*b);
     double PerimeterTriangle=a+b+c;
     System.out.println("The perimeter of the right triangle is " + PerimeterTriangle);
    }else{
       System.out.println("Error!Check again a & b!");
     }
  }
}