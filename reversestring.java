import java.util.*;

public class reversestring {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    String one = "Hello";
    String two = "hola";
    String three = "gOodbye";

    System.out.println("reversed1: " + reverseString(one)); //olleH
    System.out.println("reversed2: " + reverseString(two)); //aloh
    System.out.println("reversed3: " + reverseString(three)); //eybdoOg

  }

  public static String reverseString(String s){
    char[] chars = s.toCharArray();
    int i = 0;
    int j = s.length()-1;
    while (i < j){
      char temp = chars[i];
      chars[i++] = chars[j];
      chars[j--] = temp;
    }
    
    return new String(chars); 
  }

}
