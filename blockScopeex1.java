

public class blockScopeex1 {
 public static void main(String[] args) {
  int a = 20;
  int b = 30;
//  int a = 20; you can not declare the var again
// a= 20; you can change

{
  // int a = 30; can't
  a = 30; 
  int c = 99;
// System.out.println(c); this should be in the block 
}
// System.out.println(c); cant
// System.out.println(a); can as we are reasigining it not declaring it again

for(int i =0; i<= 10; i++){
//  int c = 33;
//  System.out.println(c); can 
}
//  System.out.println(i); cant
 } 
}
