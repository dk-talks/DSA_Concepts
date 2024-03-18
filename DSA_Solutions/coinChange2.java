class Solution {
    public int change(int amount, int[] coins) {
        // using Dynamic Programming's Bottom Up approach
        int n = coins.length;
        int[] dp = new int[amount+1];
        dp[0] = 1; // there is one way to pay 0 rupee. that is - Don't pay

        // dp[i] will store the number of ways ith amount can be payed

        for(int i = 0; i<n; i++) {
            for(int j = coins[i]; j<=amount; j++) {
                dp[j] += dp[j-coins[i]];
            }
        }

        return dp[amount];

    }
}
