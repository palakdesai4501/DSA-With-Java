// Binary search using recursion
public class recursion2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 76, 88 };
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    /**
     * 
     * @param arr
     * @param target
     * @param s
     * @param e
     * @return index of target in arr
     */
    static int search(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }

        return search(arr, target, m + 1, e);
    }
}
