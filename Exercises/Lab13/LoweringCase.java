public class LoweringCase{
  public static void main(String[] args){
   java.util.Scanner reader=new java.util.Scanner(System.in);
   System.out.println("Please input a character:");
   String word=reader.next();
   char firstletter=word.charAt(0);
   if (firstletter>='A' && firstletter<='Z'){
     char lowercase=toLowerCase(firstletter);
     System.out.println("Converted lowercase is: " + lowercase);
   }
   else if (firstletter>='a' && firstletter<='z'){
     char lowerfirstletter=firstletter;
     System.out.println(lowerfirstletter); 
   }
   else{
    System.out.println(firstletter); 
   }
  }
  
  public static char toLowerCase(char uppercase){
    char lowercase = (char) (uppercase + 'a'-'A');
    return lowercase;
  }
}