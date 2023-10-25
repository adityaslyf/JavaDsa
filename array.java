import java.util.Arrays;
import java.util.Scanner;

public class array {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] roll= new int[5];
    // System.out.println(roll[0]);

     for(int i=0; i <roll.length; i++){
      //  System.out.println(roll[i] + " ");
      roll[i] = in.nextInt();
     }
    for(int num: roll){
System.out.println(num + " ");
    }
    System.out.println(Arrays.toString(roll));
  }
}
