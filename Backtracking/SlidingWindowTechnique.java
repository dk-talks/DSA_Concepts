public class SlidingWindow {
    public static void main(String[] args) {

        /*
        A technique used to solve some problems for better time complexity
        steps -
        1. Find the size of the window required
        2. Complete the result for the first window, ie  - from the start of the data structure
        3. Use a loop to slid and compute others

        When ? -= Whenever you see Array, SubArray,  String, SubString, largest sum, max sum, min Sum. Use it.
         */

        /* Que. - Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
        arr = {1,4,2,10,23,3,1,0,20) , k = 4 (sum of 4 conseutive elements)

        Lets Use Naives approach (Brute force) to solve it.

        */
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;

        // first find the number of chunks to to check for sum of those consecutive elements
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<n-k+1; i++) {
            int currentSum = 0;
            for(int j = 0; j<k; j++) {
                currentSum += arr[i+j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("The max sum of k consecutive elements is: " + maxSum);
        // Time Complexity - O(k*n)
        
        // ----------------------------------------------Sliding Window Technique--------------------------------------------------------------------------

         // Now trying it using Sliding window technique

        // first find the reuslt of first window
        int maxSum1 = 0;
        for(int i = 0; i<k; i++) {
            maxSum1 += arr[i];
        }
        // now we have the sum of first window
        // Now in next windows, subtract previous element and add next element and check is it larger than largest sum.
        int windowSum = maxSum1;
        for(int i = k; i<n; i++) {
            windowSum = windowSum + arr[i] - arr[i-k];
            maxSum1 = Math.max(windowSum, maxSum1);
        }
        System.out.println("The largest sum using Sliding window technique is: " + maxSum1);



    }
}
