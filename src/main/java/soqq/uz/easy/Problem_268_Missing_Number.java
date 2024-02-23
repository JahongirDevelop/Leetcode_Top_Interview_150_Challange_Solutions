package soqq.uz.easy;
public class Problem_268_Missing_Number {

    public static void main(String[] args) {
        int[] nums = {0,1,3};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }
}
