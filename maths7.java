// Find Number of Set Bits
// Input: N = 6 
// Output: 2
// Explanation: Binary representation is '110' So the count of the set bit is 2.
public class maths7 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n -= (n & (-n));
        }

        // while(n > 0){
        // count++;
        // n =(n & (n-1));
        // }
        return count;
    }
}
