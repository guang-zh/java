public class CheckSquare{

     public static void main(String []args){
        java.util.Scanner reader=new java.util.Scanner(System.in);
        System.out.println("Input length in integer: ");
        int length=reader.nextInt();
        System.out.println("Input breadth in integer: ");
        int breadth=reader.nextInt();
        boolean x=isSquare(length, breadth);
        System.out.println("The rectangle is square? " + x);
     }
        
        public static boolean isSquare(int l, int b){
            boolean x=l==b;
            return x;
            
        }  
}