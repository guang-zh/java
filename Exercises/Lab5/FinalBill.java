import java.util.Scanner;

public class FinalBill{
  public static void main(String[] args){
    Scanner s = new Scanner (System.in);
    System.out.print("Enter table number: ");
    String name = s.next();
    System.out.print("Enter meals: ");
    double meal1=s.nextInt();
    double meal2=s.nextInt();
    double meal3=s.nextInt();
    double SumMeal=meal1+meal2+meal3;
    System.out.println("Total meals price is " + SumMeal);
  }
}