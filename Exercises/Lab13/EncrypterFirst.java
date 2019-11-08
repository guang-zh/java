public class EncrypterFirst{
  public static void main(String[] args){
   java.util.Scanner reader=new java.util.Scanner(System.in);
   System.out.println("Please input a character:");
   String word=reader.next();
   char firstLetter=word.charAt(0);
   char encryptedchar=encrypt(firstLetter);
   System.out.println("The encrypted character is: " + encryptedchar);
  }
  
  public static char encrypt(char userword){
    char encryptw =  (char)(userword + 3);
    return encryptw;
  }
}