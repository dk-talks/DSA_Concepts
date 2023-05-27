// Check weather an array is sorted or not using Recursion.

class isArraySorted {
    public static void main(String[] args) {
        int arr[] = {0,2,5,8,9};
        boolean result = isArrSorted(arr, 0);
        System.out.println("Is Array Sorted: " + result);
        
        // using recursion
        // just loop linearly and check if i is smaller than i+1 otherwise break the loop
        // loop will go from 0 to arr.length-2;
    }
    
    public static boolean isArrSorted(int[] arr, int index) {
        if(index == arr.length-1) {
            return true;
        }
        if(arr[index] < arr[index+1]) {
            return isArrSorted(arr, index+1);
        } else {
            return false;
        }
    }
   
}
