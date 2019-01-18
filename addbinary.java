import java.util.*;

public class addbinary {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    String test1a = "11";
    String test1b = "1";
    String test2a = "1010";
    String test2b = "1011";

    System.out.println("test1: " + addBinary(test1a, test1b));
    System.out.println("test2: " + addBinary(test2a, test2b));
  }
  
  public static String addBinary(String a, String b){
    StringBuilder sb = new StringBuilder();
    int i = a.length()-1;
    int j = b.length()-1;
    int carry = 0;

    while(i >= 0 || j >= 0){
      int sum = carry;
      if(i >= 0)
        sum += a.charAt(i--) - '0';
      if(j >= 0)
        sum += b.charAt(j--) - '0';
      
      sb.insert(0, sum % 2);
      carry = sum / 2;
    }

    if (carry > 0){
      sb.insert(0, 1);
    }

    return sb.toString(); 
  }

}
