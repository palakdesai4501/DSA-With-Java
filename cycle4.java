//Find all duplicates in array
//input: [4,3,2,7,8,2,3,1]
//output: [2,3]
import java.util.ArrayList;
import java.util.List;

public class cycle4 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findAllDuplicateNumbers(arr));

    }

    /**
     * 
     * @param arr
     * @return list of duplicate numbers in array
     */
    public static List<Integer> findAllDuplicateNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    /**
     * 
     * @param arr
     * @param first
     * @param second
     */
    // swap function to swap two elements of an array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
