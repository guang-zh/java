public class PrintStarsUpside{
  public static void main(String[] args){
   java.util.Scanner reader=new java.util.Scanner(System.in);
   System.out.println("Input a number: ");
   int num=reader.nextInt();
   for (int j=1; j<=num; j++){
     for (int i=num; i>=j; i--){
      System.out.print("*"); 
     }
    System.out.println();
   }
  }
}