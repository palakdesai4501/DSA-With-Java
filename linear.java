//Linear Search
//explanation: 
//Linear search is a very simple search algorithm. In this type of search, a sequential search is made over all items one by one. 
//Every item is checked and if a match is found then that particular item is returned, otherwise the search continues till the end of the data collection.
//Time Complexity: O(n)
//Space Complexity: O(1)
//input: [23, 22, 15, 16, -3, 19, -10, 34, 12, 10]
//target: 19
//output: 5
//explanation: 19 is present at index 5 in array
public class linear {
    public static void main(String[] args) {

        int[] nums = { 23, 22, 15, 16, -3, 19, -10, 34, 12, 10 };
        int target = 19;
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        boolean ans3 = linearSearch3(nums, target);

        System.out.println(ans);
        System.err.println(ans2);
        System.out.println(ans3);
    }

    /**
     * 
     * @param arr
     * @param target
     * @return true or false
     */
    // search the element and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }

        // this line will be execute if none of the return statements above have execute
        return false;
    }

    /**
     * 
     * @param arr
     * @param target
     * @return element
     */
    // search the element and return the element itself
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }

        // this line will be execute if none of the return statements above have execute
        return Integer.MAX_VALUE;
    }

    /**
     * 
     * @param arr
     * @param target
     * @return index
     */
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will be execute if none of the return statements above have execute
        return -1;
    }
}