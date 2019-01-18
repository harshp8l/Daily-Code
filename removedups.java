import java.util.*;

//must be done by modifying the input array in place with O(1) extra memory
//return length
public class removedups {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    int[] nums1 = {1,1,2};
    int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
    System.out.println("length: " + removeDuplicates(nums1));
    System.out.println("length: " + removeDuplicates(nums2));
    for(int i = 0; i < nums1.length; i++)
      System.out.print(nums1[i] + ", ");
    System.out.println();
    for(int i = 0; i < nums2.length; i++)
      System.out.print(nums2[i] + ", ");
    System.out.println();
  }
 
  public static int removeDuplicates(int[] nums){
    int index = 1;
    for(int i = 0; i < nums.length-1; i++){
      if(nums[i] != nums[i+1]){
        nums[index++] = nums[i+1];
      }
    }

    return index;
  }

}
