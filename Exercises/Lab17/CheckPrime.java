public class CheckPrime{
  public static void main(String[] args){
    java.util.Scanner reader=new java.util.Scanner(System.in);
    int num=reader.nextInt();
    boolean check=isPrime(num);
    if (check==true){
     System.out.println("It is a prime number!"); 
    }
    else{
     System.out.println("It is not a prime number."); 
    }
  }
  public static boolean isPrime(int num){
   boolean check=true;
   for (int i=2; i<num; i++){
     if (num%i==0){
      return false;
     }
   }
   return true;
  }
}