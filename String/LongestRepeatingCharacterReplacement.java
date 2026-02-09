package String;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, maxCount = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Increment the frequency of the current character
            count[s.charAt(right) - 'A']++;
            
            // Track the count of the most frequent character in the window
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            
            // If replacements exceed k, shrink window
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update maximum window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Main method to test
    public static void main(String[] args) {
        String s1 = "AABABBA";
        int k1 = 1;
        System.out.println("Input: " + s1 + ", k = " + k1);
        System.out.println("Output: " + characterReplacement(s1, k1)); // 4

        String s2 = "ABAB";
        int k2 = 2;
        System.out.println("Input: " + s2 + ", k = " + k2);
        System.out.println("Output: " + characterReplacement(s2, k2)); // 4
    }
}

