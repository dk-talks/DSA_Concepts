// Linear Search Algorithm

import java.util.*;

public class SearchingQuestions {

    public static void main(String[] args) {
        
        

        /*
        Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
            else print “Element not found in array”. Input the size of array, array from user and the element X from user.
            Use Linear Search to find the element.
        */

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements you want to add: ");
        int len = sc.nextInt();
        int[] arr1 = new int[len];

        System.out.print("Enter the numbers of the array: ");
        for(int i = 0; i<len; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Your array is: [");
        for(int n: arr1) {
            System.out.print(n + ", ");
        }
        System.out.print("]");
        System.out.println();

        // now applying the linear Search algorithm

        System.out.print("Enter the number you want to search for: ");
        int target = sc.nextInt();

        boolean isElementFound = false;
        for(int i = 0; i<len; i++) {
            if(arr1[i] == target) {
                System.out.println("Element is found at index number: " + i);
                isElementFound = true;
                break;
            }
        }

        if(!isElementFound) {
            System.out.println("Element is not found");
        }

    }
    
}


