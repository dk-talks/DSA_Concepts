class Solution {
    public int numDecodings(String s) {
        // top down approach
        int n = s.length();
        int[] input = new int[n];
        for(int i = 0; i<n; i++) {
            input[i] = Integer.parseInt(s.charAt(i)+"");
        }

        if(input[0] == 0) {
            return 0;
        }
        int[] dp = new int[n];
        for(int i = 0; i<n; i++) {
            dp[i] = -1;
        }

        return ways(input, n-1, dp);

    }

    public int ways(int[] nums, int i, int[] dp) {
        if(i < 0) {
            return 1;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        int currWays = 0;

        if(nums[i] != 0) {
            currWays += ways(nums, i-1, dp);    
        }

        
        if(i > 0 && (nums[i-1] == 1 || nums[i-1] == 2 && nums[i] <= 6)) {
            currWays += ways(nums, i-2, dp);
        }

        dp[i] = currWays;
        return dp[i];
    }
}
