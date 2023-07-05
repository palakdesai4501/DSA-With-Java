// Cycle sort 
//Index = Value - 1
// 1 2 3 4 5 - values
// 0 1 2 3 4 - index
// Time Complexity: O(n^2)
// Space Complexity: O(1) 
import java.util.Arrays;

public class cycle {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 
     * @param arr
     */
    static void cycleSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    /**
     * 
     * @param arr
     * @param first
     * @param second
     */
    // swap function to swap two elements of an array
     static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
