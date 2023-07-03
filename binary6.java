// Find position of a target element in infinite sorted array
// Given a sorted array of unknown length and a number to search for, return the index of the number in the array. 
// Accessing an element out of bounds throws exception. If the number occurs multiple times, return the index of any occurence. If it isn't present, return -1.
// Input: arr = [3,5,7,9,10,90,100,130,140,160,170], target = 10
// Output: 4
// Explanation: 10 appears at index 4 in arr.


public class binary6 {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(findingRange(arr, target));
        
    }

    /**
     * @param arr
     * @param target
     * @return index of target, if not found return -1
     */
    static int findingRange(int[] arr, int target){
        //first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        //comdition for target to lie in range
        while(target>arr[end]){
            int temp = end + 1; //this is a new start
            //double the box value
            //end = previous end + sizeofbox*2
            end = end + (end - start +1)*2;
            start = temp;

        }
        return binarySearch(arr, target, start, end);
    }

    /**
     * @param arr
     * @param target
     * @param start
     * @param end
     * @return index of target, if not found return -1
     */
    static int binarySearch(int[] arr, int target, int start, int end){

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
