/**
 * floor of a number
 * 
 * arr = [2,3,5,9,14,16,18] and target=15, floor = 14
 * target = 17 then floor=16
 * target = 14 then floor =14 
 */


public class binary3 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target=15;
        int ans = floorOfnumber(arr,target);
        System.out.println(ans);
    }

    static int floorOfnumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

             /**
             * find the middle element
             * int mid = (start+end)/2;
             * might be possible that (s+e)/2 exeeds the range of integer in java
             */
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
