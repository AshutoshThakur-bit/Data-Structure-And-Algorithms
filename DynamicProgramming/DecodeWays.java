package DynamicProgramming;

public class DecodeWays {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;

        int n = s.length();
        int[] dp = new int[n + 1];
        
        dp[0] = 1;  // empty string
        dp[1] = s.charAt(0) != '0' ? 1 : 0;  // first character
        
        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            
            if (oneDigit >= 1 && oneDigit <= 9)
                dp[i] += dp[i - 1];
            
            if (twoDigits >= 10 && twoDigits <= 26)
                dp[i] += dp[i - 2];
        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        String s1 = "12";
        String s2 = "226";
        String s3 = "06";

        System.out.println(numDecodings(s1)); // 2
        System.out.println(numDecodings(s2)); // 3
        System.out.println(numDecodings(s3)); // 0
    }
}
