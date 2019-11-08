public class BankService{
  public static void main(String[] args){
   java.util.Scanner reader= new java.util.Scanner(System.in);
   System.out.println("Please input your check value in dollars: ");
   double value=reader.nextDouble();
   
   if ( value >=0 && value<10){
     System.out.println(value);
     double service=0.01*value;
     System.out.println("Check value: " + value);
     System.out.println("Service charge: " + service);
   }
   else if (value>= 10 && value<100){
     double service=0.1*value;
     System.out.println("Check value: " + value);
     System.out.println("Service charge: " + service);
   }
   else if (value>=100 && value<1000){
     double service=5+0.05*value;
     System.out.println("Check value: " + value);
     System.out.println("Service charge: " + service);
   }
   else if (value>=1000){
     double service=40+0.01*value;
     System.out.println("Check value: " + value);
     System.out.println("Service charge: " + service);
   }
   else{
     System.out.println("Invalid check value");
   }
                        
  }

}