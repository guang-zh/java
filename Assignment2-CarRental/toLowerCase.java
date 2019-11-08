public class LowerCase
{
	public static void main(String[] args) {
	    java.util.Scanner reader=new java.util.Scanner(System.in);
	    System.out.println("Input country: ");
	    char usercountry=reader.next().charAt(0);
	    char country=toLowerCase(usercountry);
	    System.out.println("The country of customer is "+ country);
	}
	public static char toLowerCase(char cc){
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
}