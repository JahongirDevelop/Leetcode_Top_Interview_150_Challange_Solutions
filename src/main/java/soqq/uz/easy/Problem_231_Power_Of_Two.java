package soqq.uz.easy;

public class Problem_231_Power_Of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
    public static boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}
