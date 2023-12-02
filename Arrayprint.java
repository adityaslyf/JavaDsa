import java.util.Arrays;
import java.util.Scanner;

public class Arrayprint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];
        // for(int i=0; i <5; i++){
        //     arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        // for(int i=0; i <5; i++){
        //     System.out.println(arr[i]);
        // }
 
        // for(int num: arr){ //for every element in arr print the element
        //     System.out.println(num); //num is the element of arr
        // }

        String[] name = new String[5];
        for(int i=0; i <5; i++){
            name[i] = in.next();
        }
        System.out.println(Arrays.toString(name));
//  you can modify sting as well
name[1] = "hello";
System.out.println(Arrays.toString(name));

    }

    
}
