//public class Methods {
// public static void main(String[] args) {
//int x = 0;
//  System.out.println(x);
//  confusing(x);
//  System.out.println(x);
// }
// public static void confusing(int y) {
//  System.out.println(y);
//y = y + 1; 
//  System.out.println(y);
// }
//}


//public class Methods {
// public static void main(String[] args) {
//int x = 0;
//  System.out.println(x);
//  confusing(x);
//  System.out.println(x);
// }
// public static void confusing(int x) {
//  System.out.println(x);
//x = x + 1; 
//  System.out.println(x);
// }
//}

//public class Methods {
// public static void main(String[] args) {
//int x = 0;
//int y = 1;
//confusing(y,x);
// }
// public static void confusing(int x, int y) {
//  System.out.println(x);
//  System.out.println(y);
// }
//}

public class Methods {
 public static void main(String[] args) {
  // SPOT A
int x = 0;
  int y = 2;
  /// SPOT B
  foo(x);
  int r = 3;
  // SPOT D
 }
 public static void foo(int p) {
  int z = 3;
  // SPOT C 
 }
}

