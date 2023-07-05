// Find the maximum element in a 2D array (matrix)
// time complexity: O(n^2)
// space complexity: O(1)
public class linear5 {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12},
        };

       System.out.println(max(arr));
    }

    /**
     * 
     * @param arr
     * @return maximum value in the array
     */
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if(element2 > max){
                   max=element2;
                }
            }
        }
        return max;
    }
}
