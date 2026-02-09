package String;

import java.util.*;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s){
        int left = 0;
        int n = s.length();
        int maxlength = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch)+1);

            }
            map.put(ch, right);

            maxlength = Math.max(maxlength, right-left+1);
        }
        return maxlength;
    }
    public static void main(String[] args) {
         String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";

        System.out.println("Input: " + s1 + " → Output: " + lengthOfLongestSubstring(s1));
        System.out.println("Input: " + s2 + " → Output: " + lengthOfLongestSubstring(s2));
        System.out.println("Input: " + s3 + " → Output: " + lengthOfLongestSubstring(s3));
        System.out.println("Input: " + s4 + " → Output: " + lengthOfLongestSubstring(s4));
    }
}
