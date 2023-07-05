//Set mismatch problem 
//input: [1,2,2,4]  
//output:[2,3]
//explanation: 2 is repeated and 3 is missing in array
//input: [1,1]
//output: [1,2]
//explanation: 1 is repeated and 2 is missing in array
public class cycle5 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println("[" + ans[0] + "," + ans[1] + "]");
    }

    /**
     * 
     * @param arr
     * @return array of repeated and missing number
     */
    static int[] findErrorNums(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        //search for first missing number
        for(int index =0; index < arr.length; index++){
            if(arr[index]!=index+1){
                return new int[]{arr[index], index+1};
            }
        }
        return new int[]{-1,-1};
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
