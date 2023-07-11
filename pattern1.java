// * 
// * *
// * * *
// * * * *
public class pattern1 {
    public static void main(String[] args) {
        pyramid1(4);
    }

    static void pyramid1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}