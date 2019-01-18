import java.util.*;

public class fruitbasket {
  
  public static void main(String[] args) {

    System.out.println("Hello");
   
    int[] test1 = {1,2,1};
    int[] test2 = {0,1,2,2};
    int[] test3 = {1,2,3,2,2};
    int[] test4 = {3,3,3,1,2,1,1,2,3,3,4};

    System.out.println("totalCollect: " + totalFruit(test1)); //3
    System.out.println("totalCollect: " + totalFruit(test2)); //3
    System.out.println("totalCollect: " + totalFruit(test3)); //4
    System.out.println("totalCollect: " + totalFruit(test4)); //5

  }
  
  public static int totalFruit(int[] tree) {
    if(tree == null || tree.length == 0){
      return 0;
    } 

    int max = 1;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int i = 0;
    int j = 0;
    while(j < tree.length){
      if(map.size() <=2){
        map.put(tree[j], j++);
      }
      
      if(map.size() > 2) {
        int min = tree.length - 1;
        for(int value: map.values()){
          min = Math.min(min, value);
        }

        i = min + 1;
        map.remove(tree[min]);
      }

      max = Math.max(max, j - i);
    }

    return max;
  } 
}
