

import java.util.Scanner;

public class casecheck{
public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  char i = in.next().trim().charAt(0);

  if( i>='a' && i<='z'){
 
System.out.println("yes upercase");
    
  }else{
    System.out.println("not upercase");
  }
}

}