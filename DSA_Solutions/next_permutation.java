class Solution {
    public void nextPermutation(int[] nums) {
        /*
    Find first smaller element from last index, swap it with last element 
    And reverse the entire arry from i+1 to n-1
        */
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i >= 0) {
            // swap ith and smallest larger element than i and reverse the array
            int j = n-1;
            while(j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
