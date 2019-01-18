import java.util.*;

public class buysellstock {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    int[] test1 = {7,1,5,3,6,4};
    int[] test2= {7,6,4,3,1};
    System.out.println("maxProfit1: " + maxProfit(test1));
    System.out.println("maxProfit2: " + maxProfit(test2));

  }

  public static int maxProfit(int[] prices){
    int max = 0; 
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < prices.length; i++){
      if(prices[i] < min){
        min = prices[i];
      } else {
        max = Math.max(max, prices[i] - min);
      }
    }
    return max;
    //int profit = 0;
    //for(int i = 0; i < prices.length; i++){
    //  for(int j = i; j < prices.length; j++){
    //    if(prices[i] < prices[j] && prices[j] - prices[i] > profit){
    //      profit = prices[j] - prices[i];
    //    }
    //  }
    //}
    //return profit;
  }
}
