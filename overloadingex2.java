public class overloadingex2 {
  public static void main(String[] args) {
  int ans =  sum(3,4,6);
  System.out.println(ans);
  }

   static int sum(int a , int b){
    return a + b;
  }
  static int sum(int a , int b,int c){
return a + b + c;
  }
}
