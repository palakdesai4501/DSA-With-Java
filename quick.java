//Quick Sort
//Quick sort is a divide and conquer algorithm that divides the array into two halves and then sorts them recursively
//Time Complexity: O(nlogn)
//Space Complexity: O(logn)
import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 
     * @param nums
     * @param low
     * @param high
     */
    static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        //partition the array
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        //also a reason why if its already sorted it will not swap
        while(s<=e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            //swap
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        //now my pivot is at current index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
