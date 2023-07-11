// * * * *
// * * *
// * *
// *
public class pattern3 {
    public static void main(String[] args) {
        pyramid3(4);
    }

    static void pyramid3(int n) {
        for (int row = 1; row<=n; row++) {
            // for every row, run the col
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}

