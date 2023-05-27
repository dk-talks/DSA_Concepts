// Search in array Linearly using recursion
import java.util.ArrayList;
class OcurrencesOfNumInArray {
    public static void main(String[] args) {
        int arr[] = {0,2,5, 2, 8,9};
        System.out.println(search(arr, 2, 0, new ArrayList<Integer>()));
    }
    
    public static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list) {
        // base condition - 
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            System.out.println("Target is present at: " + index);
            list.add(index);
        }
        return search(arr, target, index+1, list);
    }
   
}
