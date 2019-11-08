public class RockPaperScissorsAI{
  public static void main(String[] args){
   java.util.Scanner reader=new java.util.Scanner(System.in);
   System.out.println("Choose from: rock, paper, or scissors");
   System.out.println("Player choose: ");
   String player=reader.next();
   

   if(player.equals("rock")){
         System.out.println ("paper"); 
         }
    else if (player.equals("scissors")){
           System.out.println("rock");
           }
     else if (player.equals("paper")) {
          System.out.println ("scissors"); 
          }     
     System.out.println("I always win! Hahahahah!");
   }
 }

