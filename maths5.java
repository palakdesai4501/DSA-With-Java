// Find if a number is power of 2 or not
// Logic: if a number is power of 2 then it will have only 1 set bit
// 4 = 100, 3 = 011
// 4 & 3 = 0
// 16 = 10000, 15 = 01111
// 16 & 15 = 0
public class maths5 {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
