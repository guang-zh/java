public class Methods {
 public static void main(String[] args) {
   int x = 0;
   int y = 1;
   int a=20;
   int b=-a;
   System.out.println(b);
   confusing(y);
 }
 public static void confusing(int x) {
  if (x < 0) {
    System.out.println(-x);
    }
  else {
    System.out.println(x);
    }
 }
}

