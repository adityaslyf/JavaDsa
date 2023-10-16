import java.util.Scanner;

public class reversenum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int reversenum = 0;
    while(n>0){
int rem = n% 10;
n /=10;
reversenum = reversenum *10 + rem;
    }

System.out.println(reversenum);
  }
}
