// * * * *
// * * * *
// * * * *
// * * * *
public class pattern2 {
    public static void main(String[] args) {
        pyramid2(4);
    }

    static void pyramid2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
