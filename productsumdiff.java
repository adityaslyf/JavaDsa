// import java.util.Scanner;
// public class productsumdiff {
//     public static void main(String[] args) {
      
    
//        int number = 123;
//         int digit = 0;
//         int remainder = number%10;
//         number= digit *10+remainder;
//         int product = digit * (digit -1);
//         int sum = digit + (digit-1);
//        System.out.println(product-sum);
//     }
//   }



import java.util.Scanner;

public class productsumdiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        
        int product = 1; // Initialize product to 1
        int sum = 0; // Initialize sum to 0
        
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            product *= digit; // Multiply the digit with the product
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }
        
        int difference = product - sum;
        System.out.println("Difference between the product and sum of digits: " + difference);
    }
}

