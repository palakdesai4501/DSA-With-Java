// Skip a string if it starts with app but not apple
// Input: bappccapplegh
// Output: bccapplegh

// Skip a string with apple removed from it
// Input: bccapplegh
// Output: bccgh
public class recursion21 {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bappccapplegh"));
        System.out.println(skipApple("bccapplegh"));
    }

    /**
     * @param up
     * @return String with apple removed from it
     */
    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    /**
     * @param up
     * @return String with app not apple removed from it
     */
    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(5));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
