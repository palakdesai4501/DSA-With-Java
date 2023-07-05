//Return missing number in array
//input: [4,0,2,1]
//output: 3
//explanation: 3 is missing in array

public class cycle1 {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missingNumber(arr));
    }

    /**
     * 
     * @param arr
     * @return missing number in array 
     */
    static int missingNumber(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        //search for first missing number 
        for(int index =0; index < arr.length; index++){
            if(arr[index]!=index){
                return index;
            }
        }

        //case 2
        return arr.length;
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
