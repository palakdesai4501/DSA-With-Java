//Insertion Sort 
//Algorithm:
//1. Start from the second element in the array and compare it with the previous element.
//2. If the current element is smaller than the previous element of the array, compare it with the elements before.
//3. Move the greater elements one position up to make space for the swapped element.
//4. Repeat steps 1 to 3 until the array is sorted.
//Time Complexity : O(n^2)
//Space Complexity : O(1)

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Insertion Sort Algorithm 
     * @param arr
     */
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * swap two elements in an array
     * @param arr
     * @param first
     * @param second
     */
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
