//Find the minimum value in an array of integers
//input: [23, 22, 15, 16, -3, 19, -10, 34, 12, 10]
//output: -10
//explanation: -10 is the minimum value in the array
public class linear3 {
    public static void main(String[] args) {
        int[] arr = {23, 22, 15, 16, -3, 19, -10, 34, 12, 10};
        System.out.println(min(arr));
    }

    /**
     * 
     * @param arr
     * @return minimum value in the array
     */
    static int min(int[] arr) {
        int minimum = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;   
    } 
}
