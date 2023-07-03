// Find peak index in a mountain array
// Given an array of integers arr, return the peak index in it.
// An array element is peak if it is NOT smaller than its neighbors.
// For example, in the array [1, 2, 3, 5, 6, 4, 3, 2], 6 is a peak element because it is larger than its neighbors (5 and 4).
// The index of the peak element is 4.
// Input: arr = [1,2,3,5,6,4,3,2]
// Output: 4
// Explanation: 6 is the peak index and it is 4.


public class binary7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2 };
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }

    /**
     * @param arr
     * @return index of peak element
     */
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // find the middle element
            // int mid = (start+end)/2;
            // might be possible that (s+e)/2 exeeds the range of integer in java
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {

                // you are in the decreasing part of the array
                // this may be the answer but look at left
                // this is why end!=mid-1
                end = mid;
            } else {
                // you are in the ascending part of the array
                start = mid + 1; // because we know that mid+1 element is > mid element
            }
        }
        
        // in the end, start==end and pointing to the largest number because of the two checks above
        // start and end are always trying to find max elemnet in the above 2 checks
        // hence, when they are pointing to just one element, that is the maximum one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // And if we are saying that only one item is remaining , hence cuz of the above line that is the best possible answer
        return start; // or return end
    }
}
