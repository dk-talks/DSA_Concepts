class Solution {
    public int search(int[] nums, int target) {

        // first find the pivot, pivot - from where the next number is smaller
        // for that I will use binary search
        int pivot = 0;
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid= start + (end - start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if( mid < end && nums[mid]>nums[mid+1]) {
                pivot = mid;
                break;
            }
            // this is neccessary because many times about mid<end will not be true
            // so,  in order to not get out of index, we need both the conditions
            if(mid > start && nums[mid] < nums[mid-1]) {
                pivot = mid-1;
                break;
            }
            if(nums[mid] < nums[0]) {
                // that means, definitely pivot is to the left side
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        start = 0;
        end = pivot;

        // now just search in two arrays of 0 to pivot and pivot+1 to nums.length-1

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        start = pivot+1;
        end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
