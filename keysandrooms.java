import java.util.*;

public class keysandrooms {
  
  public static void main(String[] args) {
    
    List<Integer> a = Arrays.asList(1);
    List<Integer> b = Arrays.asList(2);
    List<Integer> c = Arrays.asList(3);
    List<Integer> d = Arrays.asList();
    List<List<Integer>> sample = new ArrayList<>();
    sample.addAll(Arrays.asList(a,b,c,d));
    System.out.println(Arrays.toString(sample.toArray()));
    System.out.println(canVisitAllRooms(sample));
    
    List<Integer> e = Arrays.asList(1,3);
    List<Integer> f = Arrays.asList(3,0,1);
    List<Integer> g = Arrays.asList(2);
    List<Integer> h = Arrays.asList(0);
    List<List<Integer>> sample2 = new ArrayList<>();
    sample2.addAll(Arrays.asList(e,f,g,h));
    System.out.println(Arrays.toString(sample2.toArray()));
    System.out.println(canVisitAllRooms(sample2));
  }
  
  public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
      HashSet<Integer> visited = new HashSet<>();
      visited.add(0);
      
      Stack<Integer> stack = new Stack<>();
      stack.add(0);
      while(!stack.isEmpty()) {
          List<Integer> keys = rooms.get(stack.pop());
          for(int key: keys) {
              if(!visited.contains(key)) {
                  visited.add(key);
                  stack.add(key);
              }
          }
      }
      
      return visited.size() == rooms.size();
  }

}
