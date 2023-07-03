// Simple Java program to implement Binary Search
// Binary Search is a searching algorithm for finding an element's position in a sorted array.
// In this approach, the element is always searched in the middle of a portion of an array.


public class binary {
    public static void main(String[] args) {
        int arr[] = {-18, -10, -8, -4, -2, 0, 2, 3, 6, 10, 13, 16};
        int target = 6;
        int ans = binarySearch(arr,target);
        System.out.println(ans); 
    }

    /**
     * @param arr
     * @param target
     * @return index of target, if not found return -1
     */
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            // find the middle element
            // int mid = (start+end)/2;
            // might be possible that (s+e)/2 exeeds the range of integer in java
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
