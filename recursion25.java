// Letter Combinations of a Phone Number
// Input: 12
// Output: ad ae af bd be bf cd ce cf
// Senario: 1 -> a, b, c | 2 -> d, e, f | 3 -> g, h, i | 4 -> j, k, l | 5 -> m, n, o | 6 -> p, q, r | 7 -> s, t, u | 8 -> v, w, x | 9 -> y, z 
import java.util.ArrayList;

public class recursion25 {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(padRet("", "12"));
        System.out.println(padCount("", "12"));
    }

    /**
     * 
     * @param p
     * @param up
     */
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // This will convert the character to integer('2' -> 2)
        for(int i = (digit-1) *3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    /**
     * 
     * @param p
     * @param up
     * @return arraylist of all combinations
     */
    static ArrayList<String> padRet(String p, String up){
       if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // This will convert the character to integer('2' -> 2)
        
        ArrayList<String> list = new ArrayList<>();

        for(int i = (digit-1) *3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }

     /**
     * @param p
     * @param up
     * @return count of all combinations
     */
    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0'; // This will convert the character to integer('2' -> 2)
        for(int i = (digit-1) *3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
