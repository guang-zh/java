public class PrintUptoNum{
    public static void main(String[] args){
        java.util.Scanner reader=new java.util.Scanner(System.in);
        System.out.println("Input a number: ");
        int num=reader.nextInt();
        while (num<=0){
            System.out.println("Enter again: ");
            num=reader.nextInt();
        }
        for (int i=1; i<=num; i++){
            System.out.print(i+" ");
        }
        for (int z=num-1; z>0; z--){
            System.out.print(z+" ");
        }
    


    }
}