//1
//1 2
//1 2 3
//1 2 3 4
public class pattern4 {
    public static void main(String[] args) {
        pyramid4(4);
    }

    static void pyramid4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}