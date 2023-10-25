import java.util.Arrays;
import java.util.Scanner;

public class multipleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // Input the elements for the 3x3 matrix
        System.out.println("Enter the elements for the 3x3 matrix:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Display the entire matrix
        System.out.println("The 3x3 matrix is:");
        // for (int row = 0; row < arr.length; row++) {
        //     // for (int col = 0; col < arr[row].length; col++) {
        //     //     // System.out.print(arr[row][col] + " ");
               
        //     // }
        //      System.out.println(Arrays.toString(arr[row]));
        //     // System.out.println(); // Move to the next row
        // }
        for(int[] a: arr){
          System.out.println(Arrays.toString(a));
        }
    }
}
