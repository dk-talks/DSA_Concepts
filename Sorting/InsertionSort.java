        int[] arr3 = {7,12,3,4,1};

         /*
          assume arr[0] is a sorted element already, we will start from the first index
          and check if any of its previous element is larger that this, if so we will swap both of them.
         i.e at every iteration our left side of array will be sorted which ever numbers they have, but overall it is not sorted
          meaning- there can be another element that can come to this sorted array.
          Intermediate result of Insertion sort is not useful
        */

        for(int i = 1; i<arr3.length; i++) {
            // start from one, asuming 0th element is already sorted
            int temp = arr3[i];
            int j = i-1;
            while(j>=0 && arr3[j] < temp) {
                arr3[j+1] = arr3[j];
                j--;
            }

            arr3[j+1] = temp;
            
            
        }

        for(int num: arr3) {
            System.out.print(num + ", ");
        }
        System.out.println();
