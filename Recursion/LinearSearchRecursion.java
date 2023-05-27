// Search in array Linearly using recursion

class LinearSearchRecursion {
    public static void main(String[] args) {
        int arr[] = {0,2,5,8,9};
        search(arr, 9, 0);
    }
    
    public static int search(int[] arr, int target, int index) {
        // base condition - 
        if(index == arr.length) {
            System.out.println("Target is not present in array");
            return -1;
        }
        if(arr[index] == target) {
            System.out.println("Target is present at: " + index);
            return index;
        } else {
            return search(arr, target, index+1);
        }
        
    }
   
}
