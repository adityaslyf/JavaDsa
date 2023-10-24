import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    int sum=0;
    int originalN = n;
   
    while (n > 0) {
      n = n / 10;
      
      count++;
    }

    n= originalN;
    while (n > 0) {
    int  rem = n % 10;
      double base = rem;
      double exponent = count;
      double result = Math.pow(base,exponent);
       sum += result;
      n = n / 10;
    }
   
    if(sum == originalN){
      System.out.println("num is armstrong");
    }else{
      System.out.println("num is not armstrong");
    }

  }
}
