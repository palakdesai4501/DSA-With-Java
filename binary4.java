/**
 * find the smallest character in the array that is larger than the target
 * 
 * char[] letters = {'c', 'f', 'j'}; target = 'c' so ans='f'
 * char[] letters = {'c', 'f', 'j'}; target = 'j' so ans='c'
 */

public class binary4 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        int target='c';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
        
    }
    
    static char nextGreatestLetter(char[] letters, int target){

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            /**
             * find the middle element
             * int mid = (start+end)/2;
             * might be possible that (s+e)/2 exeeds the range of integer in java
             */
            int mid = start + (end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
