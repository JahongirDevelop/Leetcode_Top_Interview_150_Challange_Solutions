package soqq.uz.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_2149 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) positive.add(nums[i]);
            else negative.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) nums[i] = positive.get(i/2);
            else nums[i] = negative.get(i/2);
        }
        return nums;
    }

}
