import java.util.Arrays;
import java.util.Scanner;

public class Arrex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] roll = new int[5];

        for (int i = 0; i < roll.length; i++) {
            System.out.println("Enter roll no");
            roll[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(roll)); 
    }
}
