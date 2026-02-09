package String;


public class MinimumWindowSubstringEasy {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Step 1: Count frequency of all chars in t
        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0, right = 0;
        int required = t.length(); // total chars we need to match
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Step 2: Move the right pointer
        while (right < s.length()) {
            char r = s.charAt(right);
            if (need[r] > 0) required--; // we found one required char
            need[r]--; // reduce its count (can go negative if extra)
            right++;

            // Step 3: When all chars are matched, move left pointer to shrink window
            while (required == 0) {
                if (right - left < minLen) { // found smaller window
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);
                need[l]++; // put back the left char
                if (need[l] > 0) required++; // we lost a required char
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum Window Substring: " + minWindow(s, t));
    }
}
