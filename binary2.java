/**
 * ceiling of a number
 * 
 * arr = [2,3,5,9,14,16,18] and target=15, ceiling = 16
 * target = 17 then ceiling=18
 * target = 14 then ceiling =14 
 */



public class binary2 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target=15;
        int ans = ceilingOfnumber(arr,target);
        System.out.println(ans);
    }

    static int ceilingOfnumber(int[] arr, int target){

        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
