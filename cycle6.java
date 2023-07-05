//Find the first missing positive number
//input: [3,4,-1,1]
//output: 2
//explanation: 2 is first missing positive number in array
public class cycle6 {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    /**
     * 
     * @param arr
     * @return first missing positive number in array
     */
    static int firstMissingPositive(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        //search for first missing number
        for(int index =0; index < arr.length; index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }

        //case 2
        return arr.length+1;
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
