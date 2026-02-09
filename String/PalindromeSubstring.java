package String;



public class PalindromeSubstring{
   public static int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes
            count += expandFromCenter(s, i, i);

            // Even length palindromes
            count += expandFromCenter(s, i, i + 1);
        }

        return count;
    }

    private static int expandFromCenter(String s, int left, int right) {
        int cnt = 0;

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            cnt++;
            left--;
            right++;
        }

        return cnt;
    }
    public static void main(String[] args){
        String str = "abba";
       int palindrome = countSubstrings(str);
        System.out.println("The palindrome substring is: "+ palindrome);


    }
}