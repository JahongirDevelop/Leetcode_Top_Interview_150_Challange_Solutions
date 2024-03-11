package soqq.uz.easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Problem_88_Merge_Sorted_Array {

    /*
      Path :
      https://leetcode.com/problems/merge-sorted-array
      */

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int n = 3, m = 3;
        merge(nums1, n, nums2, m);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> lis1 = new ArrayList<>(m + n);
        if (nums2.length != 0) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] != 0) lis1.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (nums2[i] != 0) lis1.add(nums2[i]);
            }

            for (int i = 0; i < lis1.size(); i++) {
                nums1[i] = lis1.get(i);
            }
            Arrays.sort(nums1);
        }
    }

}
