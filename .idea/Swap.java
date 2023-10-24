
import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
       int a =10;
    int b= 20;
    swap(a, b);
    System.out.println(a + " " + b);

  }
  static void swap(int a, int b){
    int temp = a;
  a = b;
  b = temp;
System.out.println();
  }
}
// in above code value will not be swaped due to scope of function A