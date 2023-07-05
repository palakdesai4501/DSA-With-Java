//Selection Sort
//Algorithm:
//1. Find the maximum element in the array and swap it with the last unsorted index.
//2. Repeat the process for all the elements in the array.
//Time Complexity : O(n^2)
//Space Complexity : O(1)
import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Selection Sort Algorithm
     * @param arr
     */
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            // find the max item in the remaining array and swap with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    /**
     * swap two elements in an array
     * 
     * @param arr
     * @param first
     * @param second
     */
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    /**
     * return the index of the maximum element in the array
     * 
     * @param arr
     * @param start
     * @param end
     * @return
     */
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
