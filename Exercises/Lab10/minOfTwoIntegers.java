public class minOfTwoIntegers{
  public static void main(String[] args){
    java.util.Scanner reader=new java.util.Scanner(System.in);
    System.out.println("First number: ");
    int a= reader.nextInt();
    System.out.println("Second number: ");
    int b = reader.nextInt();
    if (a>b){
      System.out.println(b);
    }
    else if (b>a){
     System.out.println(a); 
    }
    else{
     System.out.println("Two numbers are equal!"); 
   }
  }
}