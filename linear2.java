//Search in a given range
//input: [23, 22, 15, 16, -3, 19, -10, 34, 12, 10]
//target: 19 start: 1 end: 6 (index of 19 is 5) 
//output: 5
//explanation: 19 is present in a given range of index 1 to 6 in array at index 5   

public class linear2 {
    public static void main(String[] args) {
        int[] nums = {23, 22, 15, 16, -3, 19, -10, 34, 12, 10};
        int target = 19;
        System.out.println(linearSearch(nums, target, 1,6));
    }

    /**
     * 
     * @param arr
     * @param target
     * @param start
     * @param end
     * @return index of target element
     */
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = start; index < end; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //this line will be execute if none of the return statements above have execute
        return -1;
    }
}
