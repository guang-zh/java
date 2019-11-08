public class PrintStarsPatterns{
  public static void main(String[] args){
   java.util.Scanner reader=new java.util.Scanner(System.in);
   System.out.println("Input size: ");
   int size=reader.nextInt();
   System.out.println("Input count: ");
   int count=reader.nextInt();
   for (int k=1; k<=count; k++){
    for (int j=1; j<=size; j++){
     for (int i=size; i>=j; i--){
      System.out.print("*"); 
     }
    System.out.println();
    }
  }
  }
}