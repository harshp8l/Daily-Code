import java.util.*;

public class intobalancedstrings {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    System.out.println(balancedStringSplit("RLRRLLRLRL")); //4
    System.out.println(balancedStringSplit("RLLLLRRRLR")); //3
    System.out.println(balancedStringSplit("LLLLRRRR")); //1
    System.out.println(balancedStringSplit("RLRRRLLRLL")); //2

  }

  public static int balancedStringSplit(String s) {

    int balancedCount = 0;
    int count = 0;

    for(int i = 0; i < s.length(); i++) {
        char curr = s.charAt(i);
        if (curr == 'L') {
            count++;
        } else if (curr == 'R') {
            count--;
        }

        if (count == 0) {
            balancedCount++;
        }
    }
    
    return balancedCount;
  }
}
