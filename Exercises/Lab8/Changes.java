import java.util.Scanner;
public class Changes{
  public static void main(String[] args){
    Scanner reader= new Scanner(System.in);
    System.out.println("Enter user name: ");
    String user=reader.nextLine();
    System.out.println("Enter change value: ");
    int change=reader.nextInt();
    int bill20=change/2000;
    change=change%2000;
    int bill10=change/1000;
    change=change%1000;
    int bill5=change/500;
    change=change%500;
    int twoonies=change/200;
    change=change%200;
    int loonies=change/100;
    change=change%100;
    int quarters=change/25;
    change=change%25;
    int dimes=change/10;
    change=change%10;
    int nickels=change/5;
    int pennies=change%5;
    System.out.println("Bill 20 dollars: "+bill20);
    System.out.println("Bill 10 dollars: "+bill10);
    System.out.println("Bill 5 dollars: "+bill5);
    System.out.println("Twoonies: "+twoonies);
    System.out.println("Loonies: "+loonies);
    System.out.println("Quarters: "+quarters);
    System.out.println("Dimes: "+dimes);
    System.out.println("Nickels: "+nickels);
    System.out.println("Pennies: "+pennies);
  }
}