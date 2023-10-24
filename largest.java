import java.util.Scanner;

public class Uptonzero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            n = in.nextInt(); // Read an integer from the user

            if (n == 0) {
                break; // Exit the loop when the user enters 0
            }

            sum += n; // Add the entered number to the sum
        }

        System.out.println("Sum of the entered numbers: " + sum);
    }
}

