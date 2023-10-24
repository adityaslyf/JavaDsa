import java.util.Arrays;

public class varArgs {
  public static void main(String[] args) {
    // func(2,3,4,5,6,9);
    multiple(23, 2,  "kunal", "aditya");
  }
  // they should be in the same order as in function
static void multiple(int a, int b , String ...v){

//  System.out.println(Arrays.toString(v));
System.out.println("a: " + a);
System.out.println("b: " + b);
System.out.println("Strings: " + Arrays.toString(v));
}
  static void func(int ...v){
    System.out.println(Arrays.toString(v));
  }
}