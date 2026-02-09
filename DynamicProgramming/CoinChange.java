package DynamicProgramming;

public class CoinChange {
    public static int coinchange(int [] coins, int amount){
       
        int [] dp = new int[amount+1];

        for(int i=0; i<= amount ;i++){
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;
        for(int coin : coins){
            for(int i=coin; i<=amount; i++ ){
                if(dp[i- coin] != Integer.MAX_VALUE ){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE? -1 : dp[amount];

    }
    
    public static void main(String[] args) {
         int[] coins = {1, 2, 5};
            int amount = 11;
        int result = coinchange(coins, amount);
        System.out.println("The coin change is: "+ result);
    }
}
