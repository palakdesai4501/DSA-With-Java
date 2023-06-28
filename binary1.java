// order agnostics Binary search

public class binary1 {

    public static void main(String[] args) {
        int arr[] = {-18, -10, -8, -4, -2, 0, 2, 3, 6, 10, 13, 16};
        // int arr[] = { 45, 23, 10, 5, 0, -2, -11, -20, -34, -46, -67, };
        int target = -20;
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(ans);

    }

    /**
     * @param arr
     * @param target
     * @return 
     */
    static int orderAgnosticsBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            /**
             * find the middle element
             * int mid = (start+end)/2;
             * might be possible that (s+e)/2 exeeds the range of integer in java
             */
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
