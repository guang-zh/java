//Student name: Guang   Assignment2
public class CarRental{ //check elgibility and calculate car rental cost for users
  public static void main (String [] args){
   java.util.Scanner reader=new java.util.Scanner(System.in); //create Scanner to get inputs from users
   System.out.println("Input your age: ");
   int age=reader.nextInt();
   System.out.println("Input rental country: ");
   char country=reader.next().charAt(0);
   country=toLowerCase(country);
   System.out.println("Input if you had accident before 'y' or 'n': ");
   char accident=reader.next().charAt(0);
   if (assessmentOfEligibility(age, country, accident)==true){ //check eligibility using different method
     System.out.println("Input the type of car to rent 'r' or 'f' or 'l': ");
     char type=reader.next().charAt(0);
     System.out.println("Input how many days you want to rent: ");
     int days=reader.nextInt();
     double rental=calculateCost(type, days, age); //calculate rental cost using different method
     System.out.println("The rental cost is: " + rental);
     System.out.println("Input your payment method: ");
     char paymethod=reader.next().charAt(0);
     double deposit=calculateDeposit(rental,paymethod); //calculate deposit using different method
     System.out.println("The deposit of your rental is: " + deposit); //display deposit
     double totalcost=rental+deposit;
     System.out.println("The total cost of your rental is: "+ totalcost); //display final cost
     System.out.println("Congratualtions! You successfully rented the car!"); //display message
   }
   else if (assessmentOfEligibility(age, country, accident)==false){
    System.out.println("Ineligible for car rental"); //display after checking eligibility method
   }
  }
  public static char toLowerCase(char cc){//convert charcter to lowercase
  char result;
  if (cc>='a' && cc<='z'){
   result=cc;   
  }
  else if (cc>='A' && cc<='Z'){
   result=(char)(cc+'a'-'A');   
  }
  else{
   result=cc;   
  }
  return result;
  }
  
  public static boolean assessmentOfEligibility(int age, char country, char accident){//check eligibility
  boolean result;
  if (country=='c' && age>=21 && accident =='n'){
   result=true;   
  }
  else if (country=='u' && age>=18 && accident=='n'){
   result=true;   
  }
  else if (country=='f' && age>=25){
   result=true;   
  }
  else{
      result=false;
  }
  return result;
  }

  public static double calculateCost(char type, int days, int age){//calculate rental cost based on car type, #days, age
    double baseprice=0;
    if (type=='r'){
      baseprice=40;
    }
    else if (type=='f'){
     baseprice=60; 
    }
    else if (type=='l'){
     baseprice=80; 
    }
    if (age<25){
      baseprice=baseprice+20;
    }
    double rental=0;
    if (days<3){
     rental=baseprice*0.5*days; 
    }
    else if (days>=3 && days<=7){
     rental=baseprice*0.45*days; 
    }
    else{
     rental=baseprice*0.4*days; 
    }
    double finalcost=rental + baseprice;
    if (age<25){
     finalcost=finalcost+20;
     return finalcost;
    }
    else {
      return finalcost;
    }
 }
   public static double calculateDeposit(double cost, char method){//calculate deposit amount based on payment method
     if (method=='c'){
       return 0.0;
       }
      else if (method=='d' && cost*0.2<100) {
         return 100.0; 
       }
      else {
        return cost*0.2;
     }
   }
}
