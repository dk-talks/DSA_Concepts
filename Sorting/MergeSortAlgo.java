import java.util.Arrays;

class MergeSortAlgo {

    public static void mergeProcedure(int[] nums, int start, int mid, int end) {

        // now we will have two arrays
        int[] leftArr = new int[mid-start+1];
        int[] rightAr = new int[end - mid];

        // now merge them
        int[] mergedArr = new int[leftArr.length + rightAr.length];

        // fill up both arays
        // from low + i
        for(int i = 0; i<mid-start+1; i++) {
            leftArr[i] = nums[start+i];
        }
        // from low of right part (end-mid) + i
        for(int i = 0; i<end-mid; i++) {
            rightAr[i] = nums[mid + 1 + i];
        }

        // now compare both and add to resulting array
        int i = 0;
        int j = 0; 
        int k = start;

        while(i<leftArr.length && j<rightAr.length) {
            if(leftArr[i] < rightAr[j]) {
                // left array's current element is smaller
                nums[k++] = leftArr[i++];
            } else {
                nums[k++] = rightAr[j++];
            }
        }

        // there might be possible one array is finished before other
        // check for the remaining elements, only one while loop will be executed from below

        while(i<leftArr.length) {
            nums[k++] = leftArr[i++];
        }
        while(j<rightAr.length) {
            nums[k++] = rightAr[j++];
        }


        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int start, int end) {

        if(start < end) {

            int mid = start + (end-start)/2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid+1, end);

            // now merging both the arrays
            
            mergeProcedure(nums, start, mid, end);
        }

    }

    public static void main(String[] args) {
        int[] nums = {5,2,3, 4, 9, 2, 56, 6, 1};
        
        mergeSort(nums, 0, nums.length-1);

        System.out.println("original nums");

        System.out.println(Arrays.toString(nums));

    }


    
}
