//Find duplicate number in array
//input: [1,3,4,2,2]
//output: 2
//explanation: 2 is duplicate in array
public class cycle3 {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicateNumbert(arr));
    }

    /**
     * 
     * @param arr
     * @return duplicate number in array
     */
    static int findDuplicateNumbert(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }

        }
        return -1;
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
