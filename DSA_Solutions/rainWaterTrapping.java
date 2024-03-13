class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        int i = 0;
        int j = height.length-1;

        while(i <= j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);

            if(height[i] <= height[j]) {
                int currAns = Math.min(leftMax, rightMax)-height[i];
                if(currAns > 0) {
                    ans = ans+currAns;
                }
                i++;
            } else {
                int currAns = Math.min(leftMax, rightMax)-height[j];
                if(currAns > 0) {
                    ans = ans+currAns;
                }
                j--;
            }
        }
        return ans;
    }
}
