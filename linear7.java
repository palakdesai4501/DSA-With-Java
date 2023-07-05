//Find Maximum weath in a 2D array (matrix) 
public class linear7 {
    public static void main(String[] args) {
        int[][] accounts={
            {1,2,3},
            {3,4,5},
            {5,6,7}
        };
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts){
        //person=row
        //account=col
        int ans = Integer.MIN_VALUE;
        for (int[] account2 : accounts) {
            //when you start a new col, take a new sum for that row
            int sum =0;
            for (int element : account2) {
                sum+=element;
            }

            //now we have sum of accounts of person
            //check with overall ans
            if(sum > ans){
                ans=sum;
            }
        }
        return ans;
    }
}
