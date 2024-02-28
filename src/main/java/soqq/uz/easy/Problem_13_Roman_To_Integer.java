package soqq.uz.easy;
import java.util.HashMap;

public class Problem_13_Roman_To_Integer {
    /*
      Path :
      https://leetcode.com/problems/roman-to-integer
      */
    public static void main(String[] args) {
        String rim_raqami = "LVIII";
        System.out.println(romanToInt(rim_raqami));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanValues.get(s.charAt(i));
            if (i < s.length() - 1 && romanValues.get(s.charAt(i + 1)) > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}
