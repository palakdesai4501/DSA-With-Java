// Skip character in a string 
// Input: baccdah
// Output: bcdh
public class recursion20 {
    public static void main(String[] args) {
        System.out.println(skip("baccdah"));
    }

    /**
     * skip character in a string
     * 
     * @param p
     * @param up
     */
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    /**
     * skip character in a string
     * 
     * @param up
     * @return
     */
    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }
}
