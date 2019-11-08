public class Days{
  public static void main(String[] arg){
   java.util.Scanner reader=new java.util.Scanner(System.in);
   System.out.println("Input a number from 1-7: ");
   int number=reader.nextInt();
   if (number>=1 && number<=7){
   String day=getDay(number);
   System.out.println(day);
   }
   else {
     System.out.println("Invalid value"); 
   }
  }
  public static String getDay(int n){
     String dayname=" ";
     if (n>=1 && n<=5){
      dayname="Weekday"; 
     }
     else if (n==6 || n==7){
      dayname="Weekend"; 
     }
     return dayname;
  }
  
}