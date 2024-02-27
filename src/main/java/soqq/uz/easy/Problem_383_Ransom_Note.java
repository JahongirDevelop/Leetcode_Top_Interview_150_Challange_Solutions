package soqq.uz.easy;

public class Problem_383_Ransom_Note {
    /*
      Path :
      https://leetcode.com/problems/ransom-note
      */

    public static void main(String[] args) {

        System.out.println(canConstruct("aa", "ab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[128];
        for (final char ch : magazine.toCharArray())
            ++counter[ch];
        for (final char ch : ransomNote.toCharArray())
            if (--counter[ch] < 0)
                return false;
        return true;
    }
}
