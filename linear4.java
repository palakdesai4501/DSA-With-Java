//Search in a 2D array
//time complexity: O(n^2)
//space complexity: O(1)
import java.util.Arrays;

public class linear4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 },
        };

        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * 
     * @param arr
     * @param target
     * @return index of the target element
     */
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
