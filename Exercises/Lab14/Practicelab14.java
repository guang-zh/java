public class Practicelab14{

     public static void main(String []args){
//        for (int i = -1; i > -1001; i=i-1) {
//        System.out.println(i);
       //Theory-Q1
//       int n=-1;
//       while (n>-1001){
//        System.out.println(n);
//        n=n-1;
//       }
       
//       //Theory-Q2
//       int n=10;
//       while (n<=100){
//         System.out.println(n);
//         n=n+2;
//       }
       
//      //Theory-Q2b
//       int n=10;
//       while (n<=100){
//         if (n%2==0){
//         System.out.println(n);
//         n=n+2;
//         }
       
//       //Theory-Q3
//       java.util.Scanner reader=new java.util.Scanner(System.in);
//       double sum=0;
//       int times=0;
//       while (times<100){
//       System.out.println("Input a number: ");
//       double number=reader.nextDouble();
//       sum=sum+number;
//       times=times+1;
//       }
//       System.out.println("The sum of the 100 numbers is: " + sum);
       
       //Theory-Q4
       java.util.Scanner reader=new java.util.Scanner(System.in);
       int countEven=0;
       System.out.println("Input first number: ");
       int number=reader.nextInt();
       while (number%2==0){
         countEven=countEven+1;
         System.out.println("Input another number: ");
         number=reader.nextInt();
       }
       
       System.out.println("Odd number reached: " + number);
       System.out.println("The count of even numbers is: " + countEven);
       }
       
}