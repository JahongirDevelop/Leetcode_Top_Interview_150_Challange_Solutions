package soqq.uz.easy;

import java.util.Objects;

public class Problem_125_Valid_Palindrome {

    /*
      Path :
      https://leetcode.com/problems/valid-palindrome
      */

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder();
        if(Objects.equals(s, " ")) return true;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                string.append(s.charAt(i));
            }
        }
        StringBuilder reversed = new StringBuilder(string).reverse();
        return string.toString().equalsIgnoreCase(reversed.toString());
    }
}
