// Subsequence of a string
// input: abc
// output: "", a, b, c, ab, ac, bc, abc
import java.util.ArrayList;

public class recursion22 {
    public static void main(String[] args) {
       //System.out.println(subseqRet("", "abc"));
        //subseqAscii("", "abc");
        System.out.println(subseqAsciiRet("", "abc"));

    }

    /**
     * @param p
     * @param up
     */
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
    }

    char ch = up.charAt(0);

    subseq(p + ch, up.substring(1));
    subseq(p, up.substring(1));
    }

    /**
     * subsequence with ascii values of characters
     * @param p
     * @param up
     */
    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
    }

    char ch = up.charAt(0);

    subseqAscii(p + ch, up.substring(1));
    subseqAscii(p, up.substring(1));
    subseqAscii(p + (int)ch, up.substring(1));
    }


    /**
     * @param p
     * @param up
     * @return ArrayList<String> of subsequences
     */
    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    /**
     * @param p
     * @param up
     * @return ArrayList<String> of subsequences with ascii values
     */
    static ArrayList<String> subseqAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (int)ch, up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
