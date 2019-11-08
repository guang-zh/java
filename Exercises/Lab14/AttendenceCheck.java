public class AttendenceCheck{
  public static void main(String[] args){
   java.util.Scanner reader= new java.util.Scanner(System.in);
   System.out.println("Number of classes held: ");
   int numClasses=reader.nextInt();
   System.out.println("Number of classes attended: ");
   int numAttended=reader.nextInt();
   boolean check=checkAttendance(numClasses, numAttended);
   if (check==true){
    System.out.println("you can write exam"); 
   }
   else {
    System.out.println("you can not write exam"); 
   }
  }
  public static boolean checkAttendance(int nClass, int nAttend){
    double percent= (double)nAttend/nClass;
    if (percent>=0.75){
     return true; 
    }
    else {
     return false; 
    }
  }
}