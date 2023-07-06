// Find unique element in the array
// Logic: XOR of a number with itself is 0 and XOR of a number with 0 is the number itself 
public class maths2 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 2, 1, 3, 6, 4 };
        System.out.println(ans(arr));
    }

    /**
     * 
     * @param arr
     * @return unique element in the array
     */
    static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }

        return unique;
    }
}
