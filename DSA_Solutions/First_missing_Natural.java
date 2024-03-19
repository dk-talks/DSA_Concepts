class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++) {
            while(nums[i] != i+1) {
                int idx = nums[i]-1;
                if(idx >= 0 && idx<n) {
                    if(nums[i] == nums[idx]) {
                        break;
                    }
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                } else {
                    break;
                }
            }
        }

        for(int i = 0; i<n; i++) {
            if(nums[i] != i+1) {
                return i+1;
            }
        }
        return n+1;
    }
}
