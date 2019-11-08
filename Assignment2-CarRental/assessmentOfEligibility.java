public class Eligibility
{
	public static void main(String[] args) {
	    int age=25;
	    char country='u';
	    char accident='y';
	    boolean eligibility=assessmentOfEligibility(age, country, accident);
	    System.out.println("The eligibility of customer is "+ eligibility);
	}
	public static boolean assessmentOfEligibility(int age, char country, char accident){
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
}