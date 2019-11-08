//Error: missing return statement
public class Grade{

     public static void main(String []args){
        java.util.Scanner reader=new java.util.Scanner(System.in);
        System.out.println("Input your grade: ");
        double grade=reader.nextDouble();
        if (grade>=0){
            char lettergrade=getGrade(grade);
            System.out.println("Corresponding letter grade for " + grade + " is: " + lettergrade);
        }
        else {
            System.out.println("Invalid marks!");
        }
     }
        
        public static char getGrade(double x){
        
          char l=' ';
        
          if (x>=0 && x<25){
            l= 'F';
            
        }
          else if (x>=25 && x<45){
            l= 'E';
            
        }
        else if (x>=45 && x<50){
            l= 'D';
            
        }
        else if (x>=50 && x<60){
            l= 'C';
            
        }
        else if (x>=60 && x<80){
            l= 'B';
            
        }
        else if (x>=80){
            l= 'A';
            
        }
       return l;
        }
       
}