import java.util.*;
public class reverseint {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    System.out.println(reverse(123)); //321
    System.out.println(reverse(-123)); //-321
    System.out.println(reverse(120)); //21
    System.out.println(reverse(100)); //1
  }

  public static int reverse(int x) {
    boolean negative = false;
    if (x < 0) {
      negative = true;
      x *= -1;
    }

    long reversed = 0;
    while (x > 0) {
      reversed = (reversed*10) + (x % 10);
      x /= 10;
    }
    
    if (reversed >  Integer.MAX_VALUE)
      return 0;

    return negative ? (int)(-1 * reversed) : (int)reversed;
  }
  
}
