package soqq.uz.easy;

public class Problem_121 {
    /*
      Path :
      https://leetcode.com/problems/best-time-to-buy-and-sell-stock
      */
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums)); // output 6 - 1 = 5
    }
    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

}
