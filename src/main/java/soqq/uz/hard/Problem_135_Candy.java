package soqq.uz.hard;

import java.util.Arrays;

public class Problem_135_Candy {
    /*
      Path :
      https://leetcode.com/problems/candy
      */

    public static void main(String[] args) {
        int[] ratings = {1,0,2};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}
