
import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    int reversenum = 0;
   

    for(int i=0; i <5; i++){
      arr[i] = in.nextInt();
      int num = arr[i];
    }
    while(num >0) {
      int rem = num % 10;
      reversenum = reversenum * 10 + rem;
      num = num / 10;

    }
    System.out.println(reversenum);
  }
}
