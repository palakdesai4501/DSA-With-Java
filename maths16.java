// Find LCM of two numbers using recursion 
public class maths16 {
    public static void main(String[] args) {
       // System.out.println(gcd(4, 8));
       System.out.println(lcm(2, 7));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
