//binary search in a sorted matrix
//Given a sorted matrix, find an element from it.
//Example: 
//Input :
//mat[4][4] = { {10, 20, 30, 40},
//              {15, 25, 35, 45},
//              {27, 29, 37, 48},
//              {32, 33, 39, 50}};
//              x = 29
//Output : Found at (2, 1)
//Explanation: Element at (2,1) is 29

import java.util.Arrays;

public class binary12 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(Arrays.toString(search(arr, 6)));
    }

    /**
     * 
     * @param matrix
     * @param row
     * @param cStart
     * @param cEnd
     * @param target
     * @return index of target element
     */
    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    /**
     * 
     * @param matrix
     * @param target
     * @return index of target element
     */
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);

        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);

        } else// search in 4th half
        {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

}
