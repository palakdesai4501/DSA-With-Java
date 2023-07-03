// ceiling of a number
// Given a sorted array and a target element, find the ceiling of the target element in the array.
// Ceiling of the target element is the smallest element in the array which is greater than or equal to the target element.
// Input: arr = [2,3,5,9,14,16,18], target = 15
// Output: 16
// Explanation: 16 is the smallest element in the array which is greater than or equal to 15.
// Input: arr = [2,3,5,9,14,16,18], target = 19
// Output: -1
// Explanation: There is no element in the array which is greater than or equal to 19.


public class binary2 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target=15;
        int ans = ceilingOfnumber(arr,target);
        System.out.println(ans);
    }

    /**
     * @param arr
     * @param target
     * @return index of target, if not found return -1
     */
    static int ceilingOfnumber(int[] arr, int target){

        if(target > arr[arr.length-1]){
            return -1;
        }

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
        return start;
    }
}
