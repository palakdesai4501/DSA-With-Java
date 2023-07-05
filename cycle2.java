//Find all missing numbers in array
//input: [4,3,2,7,8,2,3,1]
//output: [5,6]
//explanation: 5 and 6 are missing in array
import java.util.ArrayList;
import java.util.List;

public class cycle2 {
    public static void main(String[] args) {
         int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    /**
     * 
     * @param nums
     * @return list of missing numbers in array
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    /**
     * 
     * @param nums
     * @param first
     * @param second
     */
    // swap function to swap two elements of an array
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
