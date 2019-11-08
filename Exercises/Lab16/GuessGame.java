public class GuessGame{
    public static void main(String[] args){
        System.out.println("Think one integer number between 1 to 1000");
        int low=1;
        int high=1000;
        
        java.util.Scanner reader=new java.util.Scanner(System.in);
        System.out.println("If your number is lower than the number, write '1' for higher; If your number is higher than the number, write '2' for lower; If the numbers equal, write '3': ");
        System.out.println("First guess: "+(low+high)/2);
        int guess=reader.nextInt();
        while (guess!=3){
        if (guess==1){
            low=((low+high)/2)+1;
        }
        else if (guess==2){
            high=((low+high)/2)-1;
        }
       
        System.out.println("Next guess: "+(low+high)/2);
        System.out.println("If your number is lower than the number, write '1' for higher; If your number is higher than the number, write '2' for lower; If the numbers equal, write '3': ");
        guess=reader.nextInt();
        if (low>high){
            System.out.println("You lied!");
        }

        }
        System.out.println("You got it! The number is : " + (low+high)/2);
        
    }
}