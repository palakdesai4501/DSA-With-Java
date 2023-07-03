//  find the smallest character in the array that is larger than the target
//  Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
//  Note that the letters wrap around.
//  For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
//  Input: letters = ["c","f","j"], target = "a"
//  Output: "c"
//  Input: letters = ["c","f","j"], target = "c"
//  Output: "f"



public class binary4 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        int target='c';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
        
    }
    
    /**
     * @param letters
     * @param target
     * @return index of target, if not found return -1
     */
    static char nextGreatestLetter(char[] letters, int target){

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            // find the middle element
            // int mid = (start+end)/2;
            // might be possible that (s+e)/2 exeeds the range of integer in java
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
