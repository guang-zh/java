import java.util.Scanner;
public class Distance2points{
  public static void main(String[] args){
    Scanner reader=new Scanner(System.in);
    System.out.println("X1: ");
    double X1=reader.nextInt();
    System.out.println("X2: ");
    double X2=reader.nextInt();
      System.out.println("Y1: ");
    double Y1=reader.nextInt();
    System.out.println("Y2: ");
    double Y2=reader.nextInt();
    double Distance=Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
    System.out.println("The distance bewteen 2 points is "+ Distance);
  }
}