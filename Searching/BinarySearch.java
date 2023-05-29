// binary search algorithm O(log n)
// only works on sorted arrays either ascending order or Descending order

int arr = [3,4,6,9,19,23,45,78,79];
int targett. = 23;

int start = 0;
int end = arr.length-1;

while(start <= end) {
  int mid = start + (end - start)/2;
  if(arr[mid] == target {
    return mid;
  } else if(arr[mid] > target) {
      end = mid-1;
  } else {
      start = mid+1;
  }
}
