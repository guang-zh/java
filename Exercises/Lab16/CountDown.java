public class CountDown{
    public static void main(String[] args) throws InterruptedException {
        java.util.Scanner reader=new java.util.Scanner(System.in);
        System.out.println("Input count down number: ");
        int num=reader.nextInt();
        for (int i=num; i>0; i--){
            System.out.print(i+" ");
            Thread.sleep(500);
        }
        System.out.println("BLASTOFF!");
    }
}