import java.util.*;

public class kthlargestarr {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    int[] test1 = {3,2,1,5,6,4};
    int[] test2 = {3,2,3,1,2,4,5,5,6};
    int k1 = 2;
    int k2 = 4;

    System.out.println("testk1: " + findKthLargest(test1, k1));
    System.out.println("testk2: " + findKthLargest(test2, k2));

  }

  public static int findKthLargest(int[] nums, int k){
   
    //Runtime to build a heap is O(n) It's a trade of memory for faster runtime
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    for(int i:nums){
      minHeap.add(nums[i]);
      if(minHeap.size() > k){
        minHeap.remove();
      }
    }
    
    return minHeap.remove();
    //Arrays.sort(nums);
    //return nums[nums.length-k]; 
  } 

}
