        int arr2[] = {4,7,90,100,123,3,4,500,1,0};

        // selection sort - there will be two part of array, 1-sorted and unsorted
        // as we traverse through the array, sorted array keep on increasing from the left and unsorted array keep on decreasing
        // as described in Jenny's lecture

        for(int i = 0; i<arr2.length-1; i++) {
            int biggestElementIndex = i;
            for(int j = i+1; j<arr2.length; j++) {
                if(arr2[j] > arr2[biggestElementIndex]) {
                    biggestElementIndex = j;
                }
            }
            if(arr2[i] != arr2[biggestElementIndex]) {
                int temp = arr2[i];
                arr2[i] = arr2[biggestElementIndex];
                arr2[biggestElementIndex] = temp;
            }
        }
        // printing the array if it is sorted or not
        for(int num: arr2) {
            System.out.print(num + ", ");
        }
