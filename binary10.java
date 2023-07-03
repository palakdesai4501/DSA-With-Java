// Minimum largest sum of a split array
public class binary10 {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        System.out.println(splitArray(nums, 2));
    }

    /**
     * 
     * @param nums
     * @param m
     * @return minimum largest sum of a split array
     */
    static int splitArray(int[] nums, int m){
        int start = 0;
        int end =0;

        for(int i=0; i < nums.length; i++){
            start = Math.max(start, nums[i]); //int the end of loop this will contain the mx item from the array
            end+=nums[i];
        }

        //binary search
        while(start<end){
            //try for the mid as potential ans
            int mid = start + (end-start)/2;

            //calculate how many pieces you can divide this with this max sum
            int sum =0;
            int pieces = 1;
            for(int num:nums){
                if(sum + num > mid){
                    //you can not add this in this subarray, make new one
                    //say you add this num in new subarray, then sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces > m){
                start = mid +1;

            }else{
                end=mid;
            }
        }
        return end;

    }
}
