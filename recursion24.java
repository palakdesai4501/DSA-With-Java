// Program to print all permutations of a given string.
// Logic: We will fix the first character and then permute rest of the characters.
import java.util.ArrayList;

public class recursion24 {
    public static void main(String[] args) {
        permutations("", "abc");

        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);

        System.out.println(permutationsCount("", "abc"));
    }

    /**
     * 
     * @param p
     * @param up
     */
    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    /**
     * 
     * @param p
     * @param up
     * @return arraylist of all permutations
     */
    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    /**
     * 
     * @param p
     * @param up
     * @return count of all permutations
     */
    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}