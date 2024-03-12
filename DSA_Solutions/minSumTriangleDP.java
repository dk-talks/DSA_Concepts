public class Solution {
	public int minimumTotal(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int[][] dp = new int[n][n];
        for(int[] nums: dp) {
            Arrays.fill(nums, Integer.MIN_VALUE);
        }
        return minSum(0, 0, a, dp);
	}

    public int minSum(int i, int j, ArrayList<ArrayList<Integer>> arr, int[][] dp) {
        if(i >= arr.size()) {
            return 0;
        }
        if(dp[i][j] != Integer.MIN_VALUE) {
            return dp[i][j];
        }
        dp[i][j] = Math.min(minSum(i+1, j, arr, dp), minSum(i+1, j+1, arr, dp)) + arr.get(i).get(j);
        return dp[i][j];
    }
}
