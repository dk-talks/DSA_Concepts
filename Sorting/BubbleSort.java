
public class BubbleSort {

    public static void main(String[] args) {
        
        // In bubble sort, After each iteration the right side portion of the array is sorted
        // i.e Largest value shifts to the right most part

        // two conscecutive elements are compared, and if they are not in sorted order, they are swapped.

        int[] arr = {19,4,34,12,3,5,1,0,23,89,76,100,0};
        // int[] arr = {1,2,3,4,5};

        for(int i = 0; i<arr.length; i++) {
            boolean isSwapped = false;
            for(int j = 1; j<arr.length-i; j++) {
                if(arr[j-1]>arr[j]) {
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            // looking array at each step
            for(int num: arr) {
                System.out.print(num + ", ");
            }
            System.out.println();
            if(!isSwapped) {
                break;
            }
        }

        System.out.println("The sorted array is : ");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
    
}
