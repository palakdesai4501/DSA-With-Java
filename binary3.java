// Floor of a number
// Given a sorted array and a target element, find the floor of the target element in the array.    
// Floor of the target element is the largest element in the array which is smaller than or equal to the target element.
// Input: arr = [2,3,5,9,14,16,18], target = 15
// Output: 14
// Explanation: 14 is the largest element in the array which is less than or equal to 15.



public class binary3 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target=15;
        int ans = floorOfnumber(arr,target);
        System.out.println(ans);
    }

    /**
     * @param arr
     * @param target
     * @return index of target, if not found return -1
     */
    static int floorOfnumber(int[] arr, int target){
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
        return end;
    }
}
