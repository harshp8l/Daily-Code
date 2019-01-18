import java.util.*;

public class powtwo {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    int n0 = 0;
    int n1 = 1;
    int n2 = 16;
    int n3 = 218;
    
    System.out.println(n0 + " : " + isPowerOfTwo2(n0));
    System.out.println(n1 + " : " + isPowerOfTwo2(n1));
    System.out.println(n2 + " : " + isPowerOfTwo2(n2));
    System.out.println(n3 + " : " + isPowerOfTwo2(n3));
  }

  public static boolean isPowerOfTwo(int n){
    if(n == 0) return false;
    if(n == 1) return true;
    if(n % 2 == 1) return false;
    return isPowerOfTwo(n/2);
  }

  public static boolean isPowerOfTwo2(int n){
    double i = 1;
    while (i < n)
      i *= 2;
    return i == n;
  }
}
