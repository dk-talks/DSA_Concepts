class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int l = 1;
        int r = 1;
        int n = nums.length;

        for(int i = 0; i<n; i++) {
            if(l == 0) {
                l = 1;
            }
            if(r == 0) {
                r = 1;
            }
            l = l*nums[i];
            r = r*nums[n-1-i];

            ans = Math.max(ans, Math.max(l,r));
        }

        return ans;

    }
}
