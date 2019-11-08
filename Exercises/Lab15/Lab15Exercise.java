// Lab Exercise #15
public class Lab15Exercise{
  public static void main (String[] args){
   
//    //Exercise1
//    int n=1;
//   while (n<1001){
//    System.out.println(n);
//    n=n+1;
//    
//    //Exercise2: print numbers again
//    java.util.Scanner reader=new java.util.Scanner(System.in);
//    System.out.println("Input low number: ");
//    int lownum=reader.nextInt();
//    System.out.println("Input high number: ");
//    int highnum=reader.nextInt();
//    if (lownum<=highnum){
//      while (lownum<=highnum){
//       System.out.println(lownum);
//       lownum=lownum+1;
//      }
//    }
//    else {
//      System.out.println("Error");
//   
//   }
    
    //Exercise3: print numbers yet again
    java.util.Scanner reader=new java.util.Scanner(System.in);
    System.out.println("Input low number: ");
    int lownum=reader.nextInt();
    System.out.println("Input high number: ");
    int highnum=reader.nextInt();
    System.out.println("Input increment number: ");
    int increment=reader.nextInt();
    if (lownum<=highnum){
      while (lownum<=highnum){
       System.out.println(lownum);
       lownum=lownum+increment;
      }
    }
    else {
      System.out.println("Error");
   
   }
  }
}