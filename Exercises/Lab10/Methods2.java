//public class Methods2 {
// public static void main(String[] args) {
//int x = 0;
//  System.out.println(x);
//  confusing(x);
//  System.out.println(x);
// }
// public static int confusing(int y) {
//  System.out.println(y);
//y = y + 1; 
//  System.out.println(y);
//   return y-1;
// }
//}

//public class Methods2 {
// public static void main(String[] args) {
//int x = 0;
//  System.out.println(x);
//  x = confusing(x);
//  System.out.println(x);
// }
// public static int confusing(int y) {
//  System.out.println(y);
//y = y + 1; 
//  System.out.println(y);
//  return y-1;
// }
//}

public class Methods2 {
 public static void main(String[] args) {
   int x = 0;
   int y = 2;
   confusing(x + y);
 }
 public static int confusing(int x) {
  return more(x*x);
 }

 public static int more(int y) {
                 System.out.println(y);
                 return y;
        }
}
