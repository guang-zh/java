import java.util.Scanner;
public class Average3Numbers{
  public static void main(String[] args){
    Scanner reader=new Scanner(System.in);
    System.out.println("First number: ");
    double n1=reader.nextInt();
    System.out.println("Second number: ");
    double n2=reader.nextInt();
    System.out.println("Third number: ");
    double n3=reader.nextInt();
    double Average=(n1+n2+n3)/3;
    System.out.println("The average of three numbers is "+ Average);
  }
}