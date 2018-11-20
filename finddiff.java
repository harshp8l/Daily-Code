import java.util.*;

public class finddiff {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    String s1 = "abcd";
    String t1 = "abcde";
    String s2 = "abase";
    String t2 = "esaaba";

    System.out.println("test1: " + findTheDifference(s1,t1)); //e
    System.out.println("test2: " + findTheDifference(s2,t2)); //a
  }

  public static char findTheDifference(String s, String t) {
    HashMap<Character,Integer> counts = new HashMap<Character,Integer>();
    for(char c : s.toCharArray()) {
      counts.put(c, counts.getOrDefault(c,0) + 1);
      /*
      if(!counts.containsKey(c))
        counts.put(c, 1);
      else
        counts.put(c, counts.get(c)+1);
      */
    }

    for(char c: t.toCharArray()) {
      if(!counts.containsKey(c) || counts.get(c) == 0)
        return c;
      else
        counts.put(c, counts.get(c)-1);
    }
   
    return '\0';
  }

}
