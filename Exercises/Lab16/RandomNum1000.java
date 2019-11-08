public class RandomNum1000{
    public static void main(String[] args){
        java.util.Random randomGen=new java.util.Random();
        java.util.Scanner reader=new java.util.Scanner(System.in);
        int num=randomGen.nextInt(1000);
        System.out.println("Guess the number: ");
        int guessnum=reader.nextInt();
        int count=0;
        while (guessnum!=num){
        if (guessnum>num){
            System.out.println("lower");
            count+=1;
        }
        else if (guessnum<num){
            System.out.println("higher");
            count+=1;
        }
        guessnum=reader.nextInt();
        }
        if (guessnum==num){
            System.out.println("you win! got the number!");
            System.out.println("You guessed: " + count + " times!");
        }
    }
}