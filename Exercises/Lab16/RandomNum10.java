public class RandomNum10{
    public static void main(String[] args){
        java.util.Random randomGen=new java.util.Random();
        java.util.Scanner reader=new java.util.Scanner(System.in);
        int num=randomGen.nextInt(10);
        System.out.println("Guess the number: ");
        int guessnum=reader.nextInt();
        while (guessnum!=num){
        if (guessnum>num){
            System.out.println("need lower");
        }
        else if (guessnum<num){
            System.out.println("need higher");
        }
        guessnum=reader.nextInt();
        }
        if (guessnum==num){
            System.out.println("you win! right number!");
        }
    }
}