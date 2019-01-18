import java.util.*;

public class monotonicarr {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    int[] test1 = {1,2,2,3};
    int[] test2 = {6,5,4,4};
    int[] test3 = {1,3,2};
    int[] test4 = {1,2,4,5};
    int[] test5 = {1,1,1};
    int[] test6 = {4,4,3};

    System.out.println("test1: " + isMonotonic(test1)); //true
    System.out.println("test2: " + isMonotonic(test2)); //true
    System.out.println("test3: " + isMonotonic(test3)); //false
    System.out.println("test4: " + isMonotonic(test4)); //true
    System.out.println("test5: " + isMonotonic(test5)); //true
    System.out.println("test6: " + isMonotonic(test6)); //true


  }

  public static boolean isMonotonic(int[] A){
    boolean inc = true;
    boolean dec = true;
    
    if(A == null || A.length == 0)
      return false;
    if(A.length == 1 || A.length == 2)
      return true;

    for(int i = 0; i < A.length-1; i++){
        if(A[i] > A[i+1])
          inc = false;
        if(A[i] < A[i+1])
          dec = false;
    }
    
    return inc || dec;
  }
}
