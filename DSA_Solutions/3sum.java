class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0;
        int n = nums.length;
        while(i < n-2) {
            int j = i+1;
            int k = n-1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    ans.add(triplet);
                    int currJ = nums[j];
                    while(j < k && currJ == nums[j]) {
                        j++;
                    }

                    int currK = nums[k];
                    while(k > j && currK == nums[k]) {
                        k--;
                    }
                } else if(sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            int currI = nums[i];
            while(i < n-2 && currI == nums[i]) {
                i++;
            }
        }

        return ans;
    }
}
