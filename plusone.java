import java.util.*;

public class plusone {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    int[] test1 = {1,2,3};
    int[] test2 = {4,3,2,1};
    int[] test3 = {9};
    int[] test4 = {9,9,9,9};
    int[] test5 = {4,9,9};
    int[] test6 = {4,9,6,9,9};
    int[] test7 = {};

    System.out.println("test1: " + Arrays.toString(plusOne(test1))); //1,2,4
    System.out.println("test2: " + Arrays.toString(plusOne(test2))); //4,3,2,2
    System.out.println("test3: " + Arrays.toString(plusOne(test3))); //1,0
    System.out.println("test4: " + Arrays.toString(plusOne(test4))); //1,0,0,0,0
    System.out.println("test5: " + Arrays.toString(plusOne(test5))); //5,0,0
    System.out.println("test6: " + Arrays.toString(plusOne(test6))); //4,9,7,0,0
    System.out.println("test7: " + Arrays.toString(plusOne(test7))); //
    System.out.println(Arrays.toString(plusOne(new int[]{3,4,5}))); //3,4,6


  }
  
  public static int[] plusOne(int[] digits){
    if(digits == null || digits.length == 0){
      return new int[]{};
    }
    
    for(int i = digits.length-1; i >= 0; i--){
      if(digits[i] < 9){
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }
    
    int[] result = new int[digits.length+1];
    result[0]=1;
    return result;
  }
}
