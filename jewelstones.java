import java.util.*;

public class jewelstones {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    String oneJ = "aA";
    String oneS = "AAAbbbb";
    String twoJ = "z";
    String twoS = "ZZ";

    System.out.println("test1: " + numJewelsInStones(oneJ, oneS)); //3
    System.out.println("test2: " + numJewelsInStones(twoJ, twoS)); //0
  }

  public static int numJewelsInStones(String J, String S){
    int count = 0;
    HashSet<Character> jewels = new HashSet<Character>();
    
    for(int i = 0; i < J.length(); i++)
      jewels.add(J.charAt(i));

    for(int i = 0; i < S.length(); i++){
      if(jewels.contains(S.charAt(i)))
        count+=1;
    }
  
    return count;
  }
}
