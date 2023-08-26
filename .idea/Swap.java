
import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a =10;
    int b= 20;
    swap(a, b);
    System.out.println(a + " " + b);
  }
  static void swap(int a, int b){
    int temp = a;
  a = b;
  b = temp;

  }
}
// in above code value will not be swaped due to scope of function 