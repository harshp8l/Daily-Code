import java.util.*;

public class issubsequence {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    String s1 = "abc";
    String s2 = "ahbgdc";
    System.out.println("First ex: " + String.valueOf(isSubsequence(s1,s2)));
    String s3 = "axc";
    System.out.println("Second ex: " + String.valueOf(isSubsequence(s3,s2)));

  }

  public static boolean isSubsequence(String s, String t) {
    if (s == null || t == null)
      return false;

    if(s.equals("")) 
      return true;
    
    int is = 0;
    for (int it = 0 ; it < t.length(); it++) {
        if (s.charAt(is) == t.charAt(it))
          is++;
        if (is >= s.length()) 
          return true;
    } 

    return false;
  }

} 

