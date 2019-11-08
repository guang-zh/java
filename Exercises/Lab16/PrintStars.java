public class PrintStars{
    public static void main(String[] args){
        java.util.Scanner reader=new java.util.Scanner(System.in);
        System.out.println("Input integer: ");
        int n=reader.nextInt();
        for (int i=1; i<=n; i++){
            System.out.print("*");
            
        }
    }
}