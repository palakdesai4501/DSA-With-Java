// Find first and last position of a target element in a sorted array.
// Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]




public class binary5 {
    public static void main(String[] args) {
        int [] nums ={5,7,7,7,7,8,8,10};
        int target = 7;
        int [] ans = searchRange(nums, target);
        System.out.println("[" + ans[0] + "," + ans[1]+ "]");
    }

    /**
     * @param nums
     * @param target
     * @return index of target, if not found return -1
     */

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

   /**
    * 
    * @param nums
    * @param target
    * @param findStartIndex
    * @return index of target 
    */
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {

            // find the middle element
            // int mid = (start+end)/2;
            // might be possible that (s+e)/2 exeeds the range of integer in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {

                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
