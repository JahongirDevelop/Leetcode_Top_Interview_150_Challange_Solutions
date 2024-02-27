package soqq.uz.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Problem_290_Word_Pattern {
    /*
      Path :
      https://leetcode.com/problems/word-pattern
      */
    public static void main(String[] args) {
        wordPattern("abba", "dog cat cat dog");
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(word[i])){
                    return false;
                }
            }else {
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }
}
