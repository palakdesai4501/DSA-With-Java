// Bubble Sort
// Algorithm:
// 1. Compare the first two elements in an array and swap if necessary.
// 2. Move to the next pair and so on until the last pair.
// 3. Repeat the steps 1 and 2 for all the elements in the list.
// 4. Repeat the steps 1 to 3 until no more swaps are required.
// Time Complexity : O(n^2)
// Space Complexity : O(1)
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 
     * @param arr
     */
    static void bubbleSort(int[] arr) {
        boolean swapped;

        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {

                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted
            // hence stop the program
            if (!swapped) { // !false =true
                break;
            }
        }
    }
}
